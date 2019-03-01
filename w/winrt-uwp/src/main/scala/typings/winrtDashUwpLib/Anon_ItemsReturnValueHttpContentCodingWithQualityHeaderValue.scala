package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpContentCodingWithQualityHeaderValue extends js.Object {
  /** An array of HttpContentCodingWithQualityHeaderValue items that start at startIndex in the HttpContentCodingWithQualityHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingWithQualityHeaderValue
  /** The number of HttpContentCodingWithQualityHeaderValue items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingWithQualityHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpContentCodingWithQualityHeaderValue]
  }
}

