// create class CardDeck that extends CardList
public class CardDeck extends CardList
{
  private int suits=4;
  private int ranks=13;
   
  public void Shuffle()
  {
    Card card;
    for(int count=0; count<50000; count++)
    {
      card=this.removeRandomCard();
      this.addCardToBottom(card);
    }
  }
  
  public CardDeck()
  {
    Card temp;
    for(int suit=1; suit<=suits; suit++)
    {
      for(int rank=1; rank<=ranks; ranks++)
      {
        temp=new Card(suit, rank);
        this.addCardToBottom(temp);
      }
    }
  }
}
