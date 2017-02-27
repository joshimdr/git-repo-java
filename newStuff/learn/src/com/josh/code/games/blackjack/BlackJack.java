/**
 * 
 */
package com.josh.code.games.blackjack;

/**
 * @author munish
 *
 */
public class BlackJack {
	
	public static boolean gameInProgress = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Player dealer = new Player("Dealer");
		
		Player player = new Player("Munish");
		
		Deck d = new Deck(1);
		
		System.out.println(d);
		
		d.shuffleDeck();
		
		System.out.println("After shuffle : "+d);
		
		int count = 0;
		
		for(int i = 0; i < 6;i++){
			if(i%2==0)
				dealer.getCard(d.pullCardFromTop());
			else{
				player.getCard(d.pullCardFromTop());
			}
		}
		
		do {
			
		
			System.out.println("Current Deck (after 3 each to dealer): "+d);
			
			System.out.println("Current Hand of dealer "+dealer);
			System.out.println("Current Hand of Player "+player);
			
			while(dealer.playerCurrentTotal() < 17){
				
				dealer.getCard(d.pullCardFromTop());
			}
			
			System.out.println("Current Deck (after player and dealer both gets all cards): "+d);
			
			int total;
			if(dealer.checkIfPlayerHitsBlackJack() && player.checkIfPlayerHitsBlackJack()){
				System.out.println("It was a push ");
				gameInProgress = false;
			}else if(dealer.checkIfPlayerHitsBlackJack() && player.checkIfPlayerGoesBust()){
				System.out.println(dealer+ " Dealer Wins. He hits a black jack and you  are busted !"+player);
				gameInProgress = false;
			}else if(dealer.checkIfPlayerHitsBlackJack() && player.playerCurrentTotal()<21){
				System.out.println(dealer+ " Dealer Wins. He hits a black jack and you !"+player);
				gameInProgress = false;
			}else if(dealer.checkIfPlayerGoesBust() && player.playerCurrentTotal()<21){
				System.out.println(player+" Player WINS dealer is busted : ! "+ player.playerCurrentTotal());
				gameInProgress = false;
			}else if(dealer.playerCurrentTotal()< 21 && player.playerCurrentTotal()<21){
				if(dealer.playerCurrentTotal()>player.playerCurrentTotal()){
					System.out.println(dealer+ " Dealer Wins. His total ");
				}
				gameInProgress = false;
			}
			if(player.checkIfPlayerHitsBlackJack() && dealer.playerCurrentTotal()<21){
				System.out.println(player + "Player WINS ! hits a black jack !!");
				gameInProgress = false;
			}
			
			else if((total = dealer.playerCurrentTotal()) < 21 && player.checkIfPlayerGoesBust()){
				System.out.println(dealer+ " Dealer Wins. His total " +total);
				System.out.println(player+ "  You are busted !");
				gameInProgress = false;
			}
			else if(dealer.playerCurrentTotal() > 21 && player.playerCurrentTotal() > 21){
				System.out.println(" PUSH , Both got busted !");
				gameInProgress =false;
			}
			else{
				gameInProgress =false;
			}
			
			System.out.println("player "+player);
			System.out.println("Dealer "+dealer);
			
			if(d.deck.size()==0){
				gameInProgress = false;
			}
			
			
			
		}while(gameInProgress);
		
		
		
		
		

	}

	private static boolean gameInProgress() {
		// TODO Auto-generated method stub
		return true;
	}

}
