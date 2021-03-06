// create class CardList
import java.util.*;
public class CardList
{
  private ArrayList<Card> cards;
  private Random random=new Random();
  public CardList()
  {
    cards=new ArrayList<Card>();
  }
  public int getSize()
  {
    return cards.size();
  }
  public Card takeCardFromTop()
  {
    return cards.remove(0);
  }
  public void addCardToBottom(Card card)
  {
    cards.add(card);
  }
  public Card removeRandomCard()
  {
    return cards.remove(random.nextInt(cards.size()));
  }
  public void addCardToTop(Card card)
  {
    cards.add(0,card);
  }
  public Card getCard(int certainCard)
  {
    return cards.get(certainCard);
  }
}
