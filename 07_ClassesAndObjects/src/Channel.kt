class Channel(val name: String) {

    object Channels {

        private val channelList = listOf(
            Channel("channel1"),
            Channel("channel2"),
            Channel("channel3"),
            Channel("channel4"),
            Channel("channel5"),
            Channel("channel6"),
            Channel("channel7"),
            Channel("channel8"),
            Channel("channel9"),
        )

        fun getListChannel(): List<Channel> {

            return channelList.shuffled()
        }
    }


}