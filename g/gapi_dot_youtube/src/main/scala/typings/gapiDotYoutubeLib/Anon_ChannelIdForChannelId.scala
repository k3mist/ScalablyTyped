package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdForChannelId extends js.Object {
  /**
    * The channelId parameter specifies a YouTube channel ID. The API will only return that channel's subscriptions.
    */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The forChannelId parameter specifies a comma-separated list of channel IDs. The API response will then only contain subscriptions matching those channels.
    */
  var forChannelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of the YouTube subscription ID(s) for the resource(s) that are being retrieved. In a subscription resource, the id property specifies the YouTube subscription ID.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set this parameter's value to true to retrieve a feed of the authenticated user's subscriptions.
    */
  var mine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user.
    */
  var mySubscripbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The order parameter specifies the method that will be used to sort resources in the API response.
    */
  var order: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more subscription resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and contentDetails. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a subscription resource, the snippet property contains other properties, such as a display title for the subscription. If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: java.lang.String
}

object Anon_ChannelIdForChannelId {
  @scala.inline
  def apply(
    part: java.lang.String,
    channelId: java.lang.String = null,
    forChannelId: java.lang.String = null,
    id: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    mine: js.UndefOr[scala.Boolean] = js.undefined,
    mySubscripbers: js.UndefOr[scala.Boolean] = js.undefined,
    order: java.lang.String = null,
    pageToken: java.lang.String = null
  ): Anon_ChannelIdForChannelId = {
    val __obj = js.Dynamic.literal(part = part)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (forChannelId != null) __obj.updateDynamic("forChannelId")(forChannelId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine)
    if (!js.isUndefined(mySubscripbers)) __obj.updateDynamic("mySubscripbers")(mySubscripbers)
    if (order != null) __obj.updateDynamic("order")(order)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[Anon_ChannelIdForChannelId]
  }
}

