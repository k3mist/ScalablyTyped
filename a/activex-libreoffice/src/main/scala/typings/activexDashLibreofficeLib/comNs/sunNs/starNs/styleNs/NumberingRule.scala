package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a rule to format numberings.
  *
  * It is normally represented by a sequence of {@link com.sun.star.beans.PropertyValues} .
  */
trait NumberingRule
  extends NumberingAlignment
     with NumberingLevel

object NumberingRule {
  @scala.inline
  def apply(
    Alignment: HorizontalAlignment,
    BulletFontName: java.lang.String,
    BulletId: scala.Double,
    CharStyleName: java.lang.String,
    GraphicURL: java.lang.String,
    Insertion: scala.Double,
    NumberingType: scala.Double,
    ParentNumbering: scala.Double,
    Prefix: java.lang.String,
    StartWith: scala.Double,
    Suffix: java.lang.String,
    TextMarginDistance: scala.Double,
    TextNumberingDistance: scala.Double
  ): NumberingRule = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, BulletFontName = BulletFontName, BulletId = BulletId, CharStyleName = CharStyleName, GraphicURL = GraphicURL, Insertion = Insertion, NumberingType = NumberingType, ParentNumbering = ParentNumbering, Prefix = Prefix, StartWith = StartWith, Suffix = Suffix, TextMarginDistance = TextMarginDistance, TextNumberingDistance = TextNumberingDistance)
  
    __obj.asInstanceOf[NumberingRule]
  }
}

