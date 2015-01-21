public class War
{
  public static void main(String[] args)
  {
// create deck, hands and stacks
    CardDeck deck = new CardDeck();
    CardList p1= new CardList();
    CardList p2= new CardList();
    CardList stack1 = new CardList();
    CardList stack2 = new CardList();
    deck.Shuffle();
    System.out.println("A --- Player --- B");
    System.out.println(deck.getSize());
    for(int i= 0; i<26; i++)
    {
      Card c = deck.takeCardFromTop();
      p1.addCardToTop(c);
    }
    for(int i=0; i<26; i++){
      Card d= deck.takeCardFromTop();
      p2.addCardToTop(d);
    }
    int round = 1;
    while(p1.getSize() > 0 && p2.getSize() > 0)
    {
      Card card1 = p1.takeCardFromTop();
      stack1.addCardToTop(card1);
      Card card2 = p2.takeCardFromTop();
      stack2.addCardToTop(card2);
      if(card1.compareTo(card2)  > 0)
      {
        p1.addCardToBottom(card1);
        p1.addCardToBottom(card2);
      }
      else if(card1.compareTo(card2)< 0)
      {
        p2.addCardToBottom(card1);
        p2.addCardToBottom(card2);
      }
      else
      {
        while(stack1.getCard(stack1.getSize()-1)== stack2.getCard(stack2.getSize()-1))
        {
          stack1.addCardToTop(p1.takeCardFromTop());
          stack1.addCardToTop(p1.takeCardFromTop());
          stack2.addCardToTop(p2.takeCardFromTop());
          stack2.addCardToTop(p2.takeCardFromTop());
        }
        if((stack1.getCard(stack1.getSize()-1)).compareTo( stack2.getCard(stack2.getSize()-1)) > 0)
        {
          for(int i=0; i<stack1.getSize(); i++)
          {
            p1.addCardToBottom(stack1.takeCardFromTop());
            p1.addCardToBottom(stack2.takeCardFromTop());
          }
        }
        if((stack1.getCard(stack1.getSize()-1)).compareTo(stack2.getCard(stack2.getSize()-1)) > 0)
        {
          for(int i=0; i<stack1.getSize(); i++)
          {
            p1.addCardToBottom(stack1.takeCardFromTop());
            p1.addCardToBottom(stack2.takeCardFromTop());
          }
        }
      }
      
      System.out.println(p1.getSize() + " ---round " + round + "--- " + p2.getSize());
      System.out.println(card1.toString() + " : " + card2.toString());
      round++;
    }
  }
}
