package ui.details

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.PostsRepository
import extensions.compareDates
import extensions.formatCreatedDate
import model.ChannelOption
import theme.LatoFontBoldFamily
import ui.common.DateDivider


@Composable
fun ChannelDetailsUi(channel: ChannelOption) {
    ScrollableColumn {
        DMDetailsHeader(channel)
        val posts = PostsRepository.posts
        posts.forEachIndexed { index, post ->
            if (index == 0 ||
                (compareDates(posts[index.minus(1)].createdAt, post.createdAt))
            ) {
                DateDivider(post.createdAt)
            }
            MessageUi(post)
        }
    }
}

@Composable
private fun DMDetailsHeader(channel: ChannelOption) {
    Spacer(
        modifier = Modifier.height(20.dp)
    )
    Text(
        text = "# ${channel._name}",
        color = Color.White,
        style = MaterialTheme.typography.h4.copy(
            fontFamily = LatoFontBoldFamily
        ),
        modifier = Modifier.padding(horizontal = 20.dp)
    )
    Spacer(
        modifier = Modifier.height(10.dp)
    )
    Text(
        text = "@${channel.createdBy.username} created this channel on ${channel.createdAt.formatCreatedDate()}. " +
                "This is the very beginning of the #${channel._name} channel.",
        color = Color.White,
        style = MaterialTheme.typography.body1,
        modifier = Modifier.padding(horizontal = 20.dp)
    )
    Spacer(
        modifier = Modifier.height(20.dp)
    )
}