fun main() {
    val tile1= Red("Mushroom",25)
    val tile2 = Red("Fire",30)
    println("${tile1.points} - ${tile1.type}")

    val tile:Tile = Red("Mushroom",25)
    // isse ye pta chl gya ki tile red hogi ya blue.. 2 case h honge
        // koi else case nahin hai
    val points = when(tile)
    {
        is Blue -> tile.points*2
        is Red -> tile.points*5
    }
    println(points)  // red tile thi toh *5 kr diya
}

sealed class Tile
class Red(val type:String,val points:Int) : Tile()
class Blue(val points:Int) : Tile()

// Tile class ke types hain dono Red aur Blue