package data

import Icons
import model.*

object WorkspaceOptionsRepository {

    private val generalOptions = listOf(
        WorkspaceOption(
            id = 1,
            name = "Threads",
            image = Icons.directMessage
        ),
        WorkspaceOption(
            id = 2,
            name = "All DMs",
            image = Icons.chat
        ),
        WorkspaceOption(
            id = 3,
            name = "Mentions & reactions",
            image = Icons.mention
        ),
        WorkspaceOption(
            id = 4,
            name = "Saved items",
            image = Icons.bookmark
        ),
        WorkspaceOption(
            id = 5,
            name = "More",
            image = Icons.verticalDots
        ),
    )

    private val channels = listOf(
        ChannelOption(
            1,
            "announcements",
            Icons.hash,
            createdBy = users.first(),
            createdAt = System.currentTimeMillis()
        ),
        ChannelOption(
            2,
            "intro",
            Icons.hash,
            createdBy = users.first(),
            createdAt = System.currentTimeMillis()
        ),
        ChannelOption(
            3,
            "general",
            Icons.hash,
            createdBy = users.first(),
            createdAt = System.currentTimeMillis()
        ),
        ChannelOption(
            4,
            "help",
            Icons.hash,
            createdBy = users.first(),
            createdAt = System.currentTimeMillis()
        ),
        ChannelOption(
            5,
            "random",
            Icons.hash,
            createdBy = users.first(),
            createdAt = System.currentTimeMillis()
        )
    )

    private val directMessages = listOf(
        DMOption(
            1,
            "Slackbot",
            "slackbot.png"
        ),
        DMOption(
            2,
            "Vipul Asri",
            "people/vipulasri.jpg",
            isOnline = true
        ),
        DMOption(
            3,
            "John Damon",
            "people/person_2.jpg",
            isOnline = true
        ),
        DMOption(
            4,
            "Matt Andrews",
            "people/person_3.jpg",
            isOnline = false
        )
    )

    val options = WorkspaceOptionUiModel(
        general = generalOptions,
        channels = channels,
        messages = directMessages
    )

}