package com.josh.code.general;

import java.util.*;
import java.io.*;

public final class Account implements Comparable<Account> {
  
  enum AccountType {CASH, MARGIN, RRSP};

   public Account (
      String aFirstName,
      String aLastName,
      int aAccountNumber,
      int aBalance,
      boolean aIsNewAccount,
      AccountType aAccountType
  ) {
      //..parameter validations elided
      fFirstName = aFirstName;
      fLastName = aLastName;
      fAccountNumber = aAccountNumber;
      fBalance = aBalance;
      fIsNewAccount = aIsNewAccount;
      fAccountType = aAccountType;
   }

  /**
  * @param aThat is a non-null Account.
  *
  * @throws NullPointerException if aThat is null.
  */
  @Override public int compareTo(Account aThat) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;

    //this optimization is usually worthwhile, and can
    //always be added
    if (this == aThat) return EQUAL;

    //primitive numbers follow this form
    if (this.fAccountNumber < aThat.fAccountNumber) return BEFORE;
    if (this.fAccountNumber > aThat.fAccountNumber) return AFTER;

    //booleans follow this form
    if (!this.fIsNewAccount && aThat.fIsNewAccount) return BEFORE;
    if (this.fIsNewAccount && !aThat.fIsNewAccount) return AFTER;

    //objects, including type-safe enums, follow this form
    //note that null objects will throw an exception here
    int comparison = this.fAccountType.compareTo(aThat.fAccountType);
    if (comparison != EQUAL) return comparison;

    comparison = this.fLastName.compareTo(aThat.fLastName);
    if (comparison != EQUAL) return comparison;

    comparison = this.fFirstName.compareTo(aThat.fFirstName);
    if (comparison != EQUAL) return comparison;

    if (this.fBalance < aThat.fBalance) return BEFORE;
    if (this.fBalance > aThat.fBalance) return AFTER;

    //all comparisons have yielded equality
    //verify that compareTo is consistent with equals (optional)
    assert this.equals(aThat) : "compareTo inconsistent with equals.";

    return EQUAL;
  }

   /* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + fAccountNumber;
	result = prime * result + ((fAccountType == null) ? 0 : fAccountType.hashCode());
	result = prime * result + fBalance;
	result = prime * result + ((fFirstName == null) ? 0 : fFirstName.hashCode());
	result = prime * result + (fIsNewAccount ? 1231 : 1237);
	result = prime * result + ((fLastName == null) ? 0 : fLastName.hashCode());
	return result;
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object aThat) {
	if (this == aThat) return true;
    if (!(aThat instanceof Account)) return false;

    Account that = (Account)aThat;
    return
      ( this.fAccountNumber == that.fAccountNumber ) &&
      ( this.fAccountType == that.fAccountType ) &&
      ( this.fBalance == that.fBalance ) &&
      ( this.fIsNewAccount == that.fIsNewAccount ) &&
      ( this.fFirstName.equals(that.fFirstName) ) &&
      ( this.fLastName.equals(that.fLastName) )
    ;
}

 

   //PRIVATE

   private String fFirstName; //non-null
   private String fLastName;  //non-null
   private int fAccountNumber;
   private int fBalance;
   private boolean fIsNewAccount;

   /**
   * Type of the account, expressed as a type-safe enumeration (non-null).
   */
   private AccountType fAccountType;

   /**
   * Exercise compareTo.
   */
   public static void main (String[] aArguments) {
     //Note the difference in behaviour in equals and compareTo, for nulls:
     String text = "blah";
     Integer number = new Integer(10);
     //x.equals(null) always returns false:
     System.out.println("false: " + text.equals(null));
     System.out.println("false: " + number.equals(null) );
     //x.compareTo(null) always throws NullPointerException:
     //System.out.println( text.compareTo(null) );
     //System.out.println( number.compareTo(null) );

     Account flaubert = new Account(
      "Gustave", "Flaubert", 1003, 0,true, AccountType.MARGIN
     );

     //all of these other versions of "flaubert" differ from the
     //original in only one field
     Account flaubert2 = new Account(
       "Guy", "Flaubert", 1003, 0, true, AccountType.MARGIN
     );
     Account flaubert3 = new Account(
       "Gustave", "de Maupassant", 1003, 0, true, AccountType.MARGIN
     );
     Account flaubert4 = new Account(
       "Gustave", "Flaubert", 2004, 0, true, AccountType.MARGIN
     );
     Account flaubert5 = new Account(
       "Gustave", "Flaubert", 1003, 1, true, AccountType.MARGIN
     );
     Account flaubert6 = new Account(
       "Gustave", "Flaubert", 1003, 0, false, AccountType.MARGIN
     );
     Account flaubert7 = new Account(
       "Gustave", "Flaubert", 1003, 0, true, AccountType.CASH
     );

     System.out.println( "0: " +  flaubert.compareTo(flaubert) );
     System.out.println( "first name +: " +  flaubert2.compareTo(flaubert) );
     //Note capital letters precede small letters
     System.out.println( "last name +: " +  flaubert3.compareTo(flaubert) );
     System.out.println( "acct number +: " +  flaubert4.compareTo(flaubert) );
     System.out.println( "balance +: " +  flaubert5.compareTo(flaubert) );
     System.out.println( "is new -: " +  flaubert6.compareTo(flaubert) );
     System.out.println( "account type -: " +  flaubert7.compareTo(flaubert) );
   }
} 
