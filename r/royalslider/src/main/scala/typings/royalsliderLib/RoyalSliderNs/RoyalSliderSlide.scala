package typings
package royalsliderLib.RoyalSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderSlide extends js.Object {
  /**
    * TODO
    */
  var appendOnLoaded: scala.Boolean
  /**
    * slide element
    */
  var content: royalsliderLib.JQuery
  /**
    * TODO
    */
  var contentAdded: scala.Boolean
  /**
    * slide element wrapper
    */
  var holder: royalsliderLib.JQuery
  /**
    * slide index
    */
  var id: scala.Double
  /**
    * TODO
    */
  var images: scala.Null
  /**
    * TODO
    */
  var isAdded: scala.Boolean
  /**
    * TODO
    */
  var isAppended: scala.Boolean
  /**
    * TODO
    */
  var isBig: scala.Boolean
  /**
    * TODO
    */
  var isLoaded: scala.Boolean
  /**
    * TODO
    */
  var isLoading: scala.Boolean
  /**
    * TODO
    */
  var isRendered: scala.Boolean
  /**
    * TODO
    */
  var loadedTriggered: scala.Boolean
  /**
    * TODO
    */
  var positionSet: scala.Boolean
  /**
    * TODO
    */
  var sizeReady: scala.Boolean
  /**
    * TODO
    */
  var thumbnail: java.lang.String
}

object RoyalSliderSlide {
  @scala.inline
  def apply(
    appendOnLoaded: scala.Boolean,
    content: royalsliderLib.JQuery,
    contentAdded: scala.Boolean,
    holder: royalsliderLib.JQuery,
    id: scala.Double,
    images: scala.Null,
    isAdded: scala.Boolean,
    isAppended: scala.Boolean,
    isBig: scala.Boolean,
    isLoaded: scala.Boolean,
    isLoading: scala.Boolean,
    isRendered: scala.Boolean,
    loadedTriggered: scala.Boolean,
    positionSet: scala.Boolean,
    sizeReady: scala.Boolean,
    thumbnail: java.lang.String
  ): RoyalSliderSlide = {
    val __obj = js.Dynamic.literal(appendOnLoaded = appendOnLoaded, content = content, contentAdded = contentAdded, holder = holder, id = id, images = images, isAdded = isAdded, isAppended = isAppended, isBig = isBig, isLoaded = isLoaded, isLoading = isLoading, isRendered = isRendered, loadedTriggered = loadedTriggered, positionSet = positionSet, sizeReady = sizeReady, thumbnail = thumbnail)
  
    __obj.asInstanceOf[RoyalSliderSlide]
  }
}

