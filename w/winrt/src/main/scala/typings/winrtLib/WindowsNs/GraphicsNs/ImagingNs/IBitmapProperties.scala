package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapProperties extends IBitmapPropertiesView {
  def setPropertiesAsync(
    propertiesToSet: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, BitmapTypedValue]
    ]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IBitmapProperties {
  @scala.inline
  def apply(
    getPropertiesAsync: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String] => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapPropertySet],
    setPropertiesAsync: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, BitmapTypedValue]
    ] => winrtLib.WindowsNs.FoundationNs.IAsyncAction
  ): IBitmapProperties = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), setPropertiesAsync = js.Any.fromFunction1(setPropertiesAsync))
  
    __obj.asInstanceOf[IBitmapProperties]
  }
}

