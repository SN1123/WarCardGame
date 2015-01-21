public class Card extends PlayingCard implements Comparable<Card>
{
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  public String toString()
  {
    if (this.getSuit()==1)
    {
      if(this.getRank()==10)
      {
        return "H-T";
      }
       if (this.getRank()==11)
      {
        return "H-J";
      }
       if(this.getRank()==12)
      {
        return "H-Q";
      }
       if(this.getRank()==13)
      {
        return "H-K";
      }
      
      {
        return "H-";  
      }
    }
    if (this.getSuit()==2)
    {
      if(this.getRank()==10)
      {
        return "C-T";
      }
       if (this.getRank()==11)
      {
        return "C-J";
      }
       if(this.getRank()==12)
      {
        return "C-Q";
      }
       if(this.getRank()==13)
      {
        return "C-K";
      }
      
      {
        return "C-";
      }
    }
    if (this.getSuit()==3)
    {
      if(this.getRank()==10)
      {
        return "S-T";
      }
       if (this.getRank()==11)
      {
        return "S-J";
      }
       if(this.getRank()==12)
      {
        return "S-Q";
      }
      if(this.getRank()==13)
      {
        return "S-K";
      }
      
      {
        return "S-" ; 
      }
    }
    
    {
      if(this.getRank()==10)
      {
        return "D-T";
      }
       if (this.getRank()==11)
      {
        return "D-J";
      }
       if(this.getRank()==12)
      {
        return "D-Q";
      }
       if(this.getRank()==13)
      {
        return "D-K";
      }
      
      {
        return "D-";
      }
    }
  }
  public int compareTo(Card x)
  {
    return this.getRank()-x.getRank();
  }
}
