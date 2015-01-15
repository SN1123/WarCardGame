// Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
public class Card extends PlayingCard
{
  public Card(int suit, int rank)
  {
    super(suit, rank);
  }
  
  public String toString()
  {
    if(suit = 1)
    {
      if (rank = 1)
      {
        return "S-A";
      }
      if (rank = 10)
      {
        return "S-T";
      }
      if (rank = 11)
      {
        return "S-J";
      }
      if (rank = 12)
      {
        return "S-Q";
      }
      if (rank = 13)
      {
        return "S-K";
      }
    }

    if(suit = 2)
    {
      if (rank = 1)
      {
        return "H-A";
      }
      if (rank = 10)
      {
        return "H-T";
      }
      if (rank = 11)
      {
        return "H-J";
      }
      if (rank = 12)
      {
        return "H-Q";
      }
      if (rank = 13)
      {
        return "H-K";
      }
    }

    if(suit = 3)
    {
      if (rank = 1)
      {
        return "C-A";
      }
      if (rank = 10)
      {
        return "C-T";
      }
      if (rank = 11)
      {
        return "C-J";
      }
      if (rank = 12)
      {
        return "C-Q";
      }
      if (rank = 13)
      {
        return "C-K";
      }
    }

    if(suit = 4)
    {
      if (rank = 1)
      {
        return "D-A";
      }
      if (rank = 10)
      {
        return "D-T";
      }
      if (rank = 11)
      {
        return "D-J";
      }
      if (rank = 12)
      {
        return "D-Q";
      }
      if (rank = 13)
      {
        return "D-K";
      }
    }    
  }
  public int compareTo()
  {
    return this.getRank()- super.getRank();
  }
}
