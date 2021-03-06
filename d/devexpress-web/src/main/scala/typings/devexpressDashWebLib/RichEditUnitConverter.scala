package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the method to convert different units of measurement.
  */
trait RichEditUnitConverter extends js.Object {
  /**
    * Converts a value in centimeters to twips.
    * @param value A floating value specifying the value in centimeters to convert.
    */
  def centimetersToTwips(value: scala.Double): scala.Double
  /**
    * Converts a measurement from inches to twips.
    * @param value The inches value (floating) to be converted.
    */
  def inchesToTwips(value: scala.Double): scala.Double
  /**
    * Converts a measurement from pixels to centimeters.
    * @param value The pixels value to be converted.
    */
  def pixelsToCentimeters(value: scala.Double): scala.Double
  /**
    * Converts a measurement from pixels to inches.
    * @param value The pixels value to be converted.
    */
  def pixelsToInches(value: scala.Double): scala.Double
  /**
    * Converts a measurement from pixels to points.
    * @param value The pixels value to be converted.
    */
  def pixelsToPoints(value: scala.Double): scala.Double
  /**
    * Converts a measurement from pixels to twips.
    * @param value The pixels value to be converted.
    */
  def pixelsToTwips(value: scala.Double): scala.Double
  /**
    * Converts a measurement from points to twips.
    * @param value The points value to be converted.
    */
  def pointsToTwips(value: scala.Double): scala.Double
  /**
    * Converts a measurement from twips to centimeters.
    * @param value The twips value to be converted.
    */
  def twipsToCentimeters(value: scala.Double): scala.Double
  /**
    * Converts a measurement from twips to inches.
    * @param value The twips value to be converted.
    */
  def twipsToInches(value: scala.Double): scala.Double
  /**
    * Converts a measurement from twips to points.
    * @param value The twips value to be converted.
    */
  def twipsToPoints(value: scala.Double): scala.Double
}

object RichEditUnitConverter {
  @scala.inline
  def apply(
    centimetersToTwips: scala.Double => scala.Double,
    inchesToTwips: scala.Double => scala.Double,
    pixelsToCentimeters: scala.Double => scala.Double,
    pixelsToInches: scala.Double => scala.Double,
    pixelsToPoints: scala.Double => scala.Double,
    pixelsToTwips: scala.Double => scala.Double,
    pointsToTwips: scala.Double => scala.Double,
    twipsToCentimeters: scala.Double => scala.Double,
    twipsToInches: scala.Double => scala.Double,
    twipsToPoints: scala.Double => scala.Double
  ): RichEditUnitConverter = {
    val __obj = js.Dynamic.literal(centimetersToTwips = js.Any.fromFunction1(centimetersToTwips), inchesToTwips = js.Any.fromFunction1(inchesToTwips), pixelsToCentimeters = js.Any.fromFunction1(pixelsToCentimeters), pixelsToInches = js.Any.fromFunction1(pixelsToInches), pixelsToPoints = js.Any.fromFunction1(pixelsToPoints), pixelsToTwips = js.Any.fromFunction1(pixelsToTwips), pointsToTwips = js.Any.fromFunction1(pointsToTwips), twipsToCentimeters = js.Any.fromFunction1(twipsToCentimeters), twipsToInches = js.Any.fromFunction1(twipsToInches), twipsToPoints = js.Any.fromFunction1(twipsToPoints))
  
    __obj.asInstanceOf[RichEditUnitConverter]
  }
}

