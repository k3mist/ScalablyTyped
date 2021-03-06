package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The people in this page of results. Each item includes the id, displayName, image, and url for the person. To retrieve additional profile data, see the
    * people.get method.
    */
  var items: js.UndefOr[js.Array[Person]] = js.undefined
  /** Identifies this resource as a collection of people. Value: "plus#peopleFeed". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Link to this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this collection of people. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The total number of people available in this list. The number of people in a response might be smaller due to paging. This might not be set for all
    * collections.
    */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object PeopleFeed {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Person] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    selfLink: java.lang.String = null,
    title: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): PeopleFeed = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (title != null) __obj.updateDynamic("title")(title)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeopleFeed]
  }
}

