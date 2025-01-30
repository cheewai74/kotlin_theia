class Song(val title: String, val artist: String){
    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing the $title")
    }
}

fun main(){
    val songOne = Song("Yesterday once more", "carpenter")
    val songTwo = Song("Ding Dong", "Sammi Cheng")
    val songThree = Song("Shoulder to cry on", "Tommy Page")
    songOne.play()
    songOne.stop()
    songTwo.play()
    songTwo.stop()
    songThree.play()
    songThree.stop()
}