package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the image slider's ImageSliderItem object.
  */
trait ASPxClientImageSliderItem extends js.Object {
  /**
    * Gets an image slider to which the current item belongs.
    * Value: An <see cref="ASPxClientImageSlider" /> object that is the item's owner.
    */
  var imageSlider: ASPxClientImageSlider
  /**
    * Gets or sets the path to the image displayed within the ASPxClientImageSliderItem.
    * Value: A <see cref="String" /> value specifying the path to the image.
    */
  var imageUrl: java.lang.String
  /**
    * Gets the item's index within an items collection.
    * Value: An integer value is the item's zero-based index within the Items collection.
    */
  var index: scala.Double
  /**
    * Gets whether the image slider's item is loaded.
    * Value: true, is the item is loaded; otherwise, false.
    */
  var loaded: scala.Boolean
  /**
    * Gets the name that uniquely identifies the image slider item.
    * Value: A string value that is the value assigned to the item's Name property.
    */
  var name: java.lang.String
  /**
    * Gets the item's display text.
    * Value: A string value that is the item's display text.
    */
  var text: java.lang.String
}

object ASPxClientImageSliderItem {
  @scala.inline
  def apply(
    imageSlider: ASPxClientImageSlider,
    imageUrl: java.lang.String,
    index: scala.Double,
    loaded: scala.Boolean,
    name: java.lang.String,
    text: java.lang.String
  ): ASPxClientImageSliderItem = {
    val __obj = js.Dynamic.literal(imageSlider = imageSlider, imageUrl = imageUrl, index = index, loaded = loaded, name = name, text = text)
  
    __obj.asInstanceOf[ASPxClientImageSliderItem]
  }
}

