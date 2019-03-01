package typings
package gapiDotPlusLib.gapiNs.clientNs.plusNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search response
trait PeopleFeed extends js.Object {
  var etag: java.lang.String
  var items: js.Array[Person]
  var kind: gapiDotPlusLib.gapiDotPlusLibStrings.`plus#peopleFeed`
  var nextPageToken: java.lang.String
  var selfLink: java.lang.String
  var title: java.lang.String
  var totalItems: scala.Double
}

object PeopleFeed {
  @scala.inline
  def apply(
    etag: java.lang.String,
    items: js.Array[Person],
    kind: gapiDotPlusLib.gapiDotPlusLibStrings.`plus#peopleFeed`,
    nextPageToken: java.lang.String,
    selfLink: java.lang.String,
    title: java.lang.String,
    totalItems: scala.Double
  ): PeopleFeed = {
    val __obj = js.Dynamic.literal(etag = etag, items = items, kind = kind, nextPageToken = nextPageToken, selfLink = selfLink, title = title, totalItems = totalItems)
  
    __obj.asInstanceOf[PeopleFeed]
  }
}

