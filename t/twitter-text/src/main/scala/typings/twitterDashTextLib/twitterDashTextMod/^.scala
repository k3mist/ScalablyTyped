package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twitter-text", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def autoLink(text: java.lang.String): java.lang.String = js.native
  def autoLink(text: java.lang.String, options: AutoLinkOptions): java.lang.String = js.native
  def autoLinkCashtags(text: java.lang.String): java.lang.String = js.native
  def autoLinkCashtags(text: java.lang.String, options: AutoLinkOptions): java.lang.String = js.native
  def autoLinkEntities(text: java.lang.String, entities: js.Array[EntityWithIndices]): java.lang.String = js.native
  def autoLinkEntities(text: java.lang.String, entities: js.Array[EntityWithIndices], options: AutoLinkOptions): java.lang.String = js.native
  def autoLinkHashtags(text: java.lang.String): java.lang.String = js.native
  def autoLinkHashtags(text: java.lang.String, options: AutoLinkOptions): java.lang.String = js.native
  def autoLinkUrlsCustom(text: java.lang.String): java.lang.String = js.native
  def autoLinkUrlsCustom(text: java.lang.String, options: AutoLinkOptions): java.lang.String = js.native
  def autoLinkUsernamesOrLists(text: java.lang.String): java.lang.String = js.native
  def autoLinkUsernamesOrLists(text: java.lang.String, options: AutoLinkOptions): java.lang.String = js.native
  def convertUnicodeIndices(text: java.lang.String, entities: js.Array[EntityWithIndices]): scala.Unit = js.native
  def convertUnicodeIndices(text: java.lang.String, entities: js.Array[EntityWithIndices], indicesInUTF16: scala.Boolean): scala.Unit = js.native
  def extractCashtags(text: java.lang.String): js.Array[java.lang.String] = js.native
  def extractCashtagsWithIndices(text: java.lang.String): js.Array[CashtagWithIndices] = js.native
  def extractEntitiesWithIndices(text: java.lang.String): js.Array[EntityWithIndices] = js.native
  def extractHashtags(text: java.lang.String): js.Array[java.lang.String] = js.native
  def extractHashtagsWithIndices(text: java.lang.String): js.Array[HashtagWithIndices] = js.native
  def extractMentions(text: java.lang.String): js.Array[java.lang.String] = js.native
  def extractMentionsOrListsWithIndices(text: java.lang.String): js.Array[MentionOrListWithIndices] = js.native
  def extractMentionsWithIndices(text: java.lang.String): js.Array[MentionWithIndices] = js.native
  def extractReplies(text: java.lang.String): js.Array[java.lang.String] = js.native
  def extractUrls(text: java.lang.String): js.Array[java.lang.String] = js.native
  def extractUrlsWithIndices(text: java.lang.String): js.Array[UrlWithIndices] = js.native
  def extractUrlsWithIndices(text: java.lang.String, options: twitterDashTextLib.Anon_ExtractUrlsWithoutProtocol): js.Array[UrlWithIndices] = js.native
  def getTweetLength(text: java.lang.String): scala.Double = js.native
  def getTweetLength(text: java.lang.String, options: TweetLengthOptions): scala.Double = js.native
  def getUnicodeTextLength(text: java.lang.String): scala.Double = js.native
  def hasInvalidCharacters(text: java.lang.String): scala.Boolean = js.native
  def hitHighlight(text: java.lang.String): java.lang.String = js.native
  def hitHighlight(text: java.lang.String, hits: js.Array[js.Array[scala.Double]]): java.lang.String = js.native
  def hitHighlight(
    text: java.lang.String,
    hits: js.Array[js.Array[scala.Double]],
    options: twitterDashTextLib.Anon_Tag
  ): java.lang.String = js.native
  def htmlEscape(text: java.lang.String): java.lang.String = js.native
  def isInvalidTweet(text: java.lang.String): java.lang.String = js.native
  def isValidHashtag(hashtag: java.lang.String): scala.Boolean = js.native
  def isValidList(usernameList: java.lang.String): scala.Boolean = js.native
  def isValidUrl(url: java.lang.String, unicodeDomains: scala.Boolean, requireProtocol: scala.Boolean): scala.Boolean = js.native
  def isValidUsername(username: java.lang.String): scala.Boolean = js.native
  def modifyIndicesFromUTF16ToUnicode[I](i: I): I = js.native
  def modifyIndicesFromUnicodeToUTF16[I](i: I): I = js.native
  def parseTweet(text: java.lang.String): ParsedTweet = js.native
  def parseTweet(text: java.lang.String, options: ParseTweetOptions): ParsedTweet = js.native
  def splitTags(text: java.lang.String): js.Array[java.lang.String] = js.native
}

