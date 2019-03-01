package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the characteristics of a font.
  *
  * For example, this can be used to select a font.
  */
trait FontDescriptor extends js.Object {
  /**
    * specifies the character set which is supported by the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.CharSet} .
    */
  var CharSet: scala.Double
  /**
    * specifies the character width.
    *
    * Depending on the specified width, a font that supports this width may be selected.
    *
    * The value is expressed as a percentage.
    */
  var CharacterWidth: scala.Double
  /**
    * specifies the general style of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontFamily} .
    */
  var Family: scala.Double
  /** specifies the height of the font in the measure of the destination. */
  var Height: scala.Double
  /** For requesting, it specifies if there is a kerning table available. For selecting, it specifies if the kerning table is to be used. */
  var Kerning: scala.Boolean
  /** specifies the exact name of the font. */
  var Name: java.lang.String
  /**
    * specifies the rotation of the font.
    *
    * The unit of measure is degrees; 0 is the baseline.
    */
  var Orientation: scala.Double
  /**
    * specifies the pitch of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontPitch} .
    */
  var Pitch: scala.Double
  /** specifies the slant of the font. */
  var Slant: FontSlant
  /**
    * specifies the kind of strikeout.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontStrikeout} .
    */
  var Strikeout: scala.Double
  /** specifies the style name of the font. */
  var StyleName: java.lang.String
  /**
    * specifies the technology of the font representation.
    *
    * One or more values out of the constant group {@link com.sun.star.awt.FontType} can be combined by an arithmetical or-operation.
    */
  var Type: scala.Double
  /**
    * specifies the kind of underlining.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontUnderline} .
    */
  var Underline: scala.Double
  /**
    * specifies the thickness of the line.
    *
    * Depending on the specified weight, a font that supports this thickness may be selected.
    *
    * The value is expressed as a percentage.
    */
  var Weight: scala.Double
  /** specifies the width of the font in the measure of the destination. */
  var Width: scala.Double
  /**
    * specifies if only words get underlined.
    *
    * `TRUE` means that only non-space characters get underlined, `FALSE` means that the spacing also gets underlined.
    *
    * This property is only valid if the property {@link com.sun.star.awt.FontDescriptor.Underline} is not {@link FontUnderline.NONE} .
    */
  var WordLineMode: scala.Boolean
}

object FontDescriptor {
  @scala.inline
  def apply(
    CharSet: scala.Double,
    CharacterWidth: scala.Double,
    Family: scala.Double,
    Height: scala.Double,
    Kerning: scala.Boolean,
    Name: java.lang.String,
    Orientation: scala.Double,
    Pitch: scala.Double,
    Slant: FontSlant,
    Strikeout: scala.Double,
    StyleName: java.lang.String,
    Type: scala.Double,
    Underline: scala.Double,
    Weight: scala.Double,
    Width: scala.Double,
    WordLineMode: scala.Boolean
  ): FontDescriptor = {
    val __obj = js.Dynamic.literal(CharSet = CharSet, CharacterWidth = CharacterWidth, Family = Family, Height = Height, Kerning = Kerning, Name = Name, Orientation = Orientation, Pitch = Pitch, Slant = Slant, Strikeout = Strikeout, StyleName = StyleName, Type = Type, Underline = Underline, Weight = Weight, Width = Width, WordLineMode = WordLineMode)
  
    __obj.asInstanceOf[FontDescriptor]
  }
}

