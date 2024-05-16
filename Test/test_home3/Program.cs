using System;
 
class CyberForum
{
    private static void Main()
    {
        string abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        string result = string.Empty;
 
        for ( int i = 0; i < abc.Length; i++ )
            if ( char.IsUpper( abc[ i ] ) )
                result += char.ToLower( abc[ i ] );
            else
                result += char.ToUpper( abc[ i ] );
 
        Console.WriteLine( result );
        Console.ReadKey( true );

    }
}    
