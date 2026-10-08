class Game
{
    void type ()
    {
        System.out.println ("Indoor & outdoor");
    } 
}
class cricket extends  Game
{
    void type ()
    {
        System.out.println ("outdoor game");
    }
}
class upcasting
{
    public static void  main (String args [])
    {
        Game gm = new Game();
        cricket ck = new cricket();
        gm.type();
        ck.type();
        gm.type();
        ck.type();
    }
}
