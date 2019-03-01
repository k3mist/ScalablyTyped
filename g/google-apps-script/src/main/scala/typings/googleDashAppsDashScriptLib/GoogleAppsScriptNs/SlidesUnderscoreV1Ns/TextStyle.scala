package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Represents the styling that can be applied to a TextRun.
//
// If this text is contained in a shape with a parent placeholder, then these text styles may be
// inherited from the parent. Which text styles are inherited depend on the
// nesting level of lists:
//
// * A text run in a paragraph that is not in a list will inherit its text style
//   from the the newline character in the paragraph at the 0 nesting level of
//   the list inside the parent placeholder.
// * A text run in a paragraph that is in a list will inherit its text style
//   from the newline character in the paragraph at its corresponding nesting
//   level of the list inside the parent placeholder.
//
// Inherited text styles are represented as unset fields in this message. If
// text is contained in a shape without a parent placeholder, unsetting these
// fields will revert the style to a value matching the defaults in the Slides
// editor.
trait TextStyle extends js.Object {
  // The background color of the text. If set, the color is either opaque or
  // transparent, depending on if the `opaque_color` field in it is set.
  var background_color: OptionalColor
  // The text's vertical offset from its normal position.
  //
  // Text with `SUPERSCRIPT` or `SUBSCRIPT` baseline offsets is automatically
  // rendered in a smaller font size, computed based on the `font_size` field.
  // The `font_size` itself is not affected by changes in this field.
  var baseline_offset: TextStyleBaselineOffset
  // Whether or not the text is rendered as bold.
  var bold: scala.Boolean
  // The font family of the text.
  //
  // The font family can be any font from the Font menu in Slides or from
  // [Google Fonts] (https://fonts.google.com/). If the font name is
  // unrecognized, the text is rendered in `Arial`.
  //
  // Some fonts can affect the weight of the text. If an update request
  // specifies values for both `font_family` and `bold`, the explicitly-set
  // `bold` value is used.
  var font_family: java.lang.String
  // The size of the text's font. When read, the `font_size` will specified in
  // points.
  var font_size: Dimension
  // The color of the text itself. If set, the color is either opaque or
  // transparent, depending on if the `opaque_color` field in it is set.
  var foreground_color: OptionalColor
  // Whether or not the text is italicized.
  var italic: scala.Boolean
  // The hyperlink destination of the text. If unset, there is no link. Links
  // are not inherited from parent text.
  //
  // Changing the link in an update request causes some other changes to the
  // text style of the range:
  //
  // * When setting a link, the text foreground color will be set to
  //   ThemeColorType.HYPERLINK and the text will
  //   be underlined. If these fields are modified in the same
  //   request, those values will be used instead of the link defaults.
  // * Setting a link on a text range that overlaps with an existing link will
  //   also update the existing link to point to the new URL.
  // * Links are not settable on newline characters. As a result, setting a link
  //   on a text range that crosses a paragraph boundary, such as `"ABC\n123"`,
  //   will separate the newline character(s) into their own text runs. The
  //   link will be applied separately to the runs before and after the newline.
  // * Removing a link will update the text style of the range to match the
  //   style of the preceding text (or the default text styles if the preceding
  //   text is another link) unless different styles are being set in the same
  //   request.
  var link: Link
  // Whether or not the text is in small capital letters.
  var small_caps: scala.Boolean
  // Whether or not the text is struck through.
  var strikethrough: scala.Boolean
  // Whether or not the text is underlined.
  var underline: scala.Boolean
  // The font family and rendered weight of the text.
  //
  // This field is an extension of `font_family` meant to support explicit font
  // weights without breaking backwards compatibility. As such, when reading the
  // style of a range of text, the value of `weighted_font_family#font_family`
  // will always be equal to that of `font_family`. However, when writing, if
  // both fields are included in the field mask (either explicitly or through
  // the wildcard `"*"`), their values are reconciled as follows:
  //
  // * If `font_family` is set and `weighted_font_family` is not, the value of
  //   `font_family` is applied with weight `400` ("normal").
  // * If both fields are set, the value of `font_family` must match that of
  //   `weighted_font_family#font_family`. If so, the font family and weight of
  //   `weighted_font_family` is applied. Otherwise, a 400 bad request error is
  //   returned.
  // * If `weighted_font_family` is set and `font_family` is not, the font
  //   family and weight of `weighted_font_family` is applied.
  // * If neither field is set, the font family and weight of the text inherit
  //   from the parent. Note that these properties cannot inherit separately
  //   from each other.
  //
  // If an update request specifies values for both `weighted_font_family` and
  // `bold`, the `weighted_font_family` is applied first, then `bold`.
  //
  // If `weighted_font_family#weight` is not set, it defaults to `400`.
  //
  // If `weighted_font_family` is set, then `weighted_font_family#font_family`
  // must also be set with a non-empty value. Otherwise, a 400 bad request error
  // is returned.
  var weighted_font_family: TextStyleWeightedFontFamily
}

object TextStyle {
  @scala.inline
  def apply(
    background_color: OptionalColor,
    baseline_offset: TextStyleBaselineOffset,
    bold: scala.Boolean,
    font_family: java.lang.String,
    font_size: Dimension,
    foreground_color: OptionalColor,
    italic: scala.Boolean,
    link: Link,
    small_caps: scala.Boolean,
    strikethrough: scala.Boolean,
    underline: scala.Boolean,
    weighted_font_family: TextStyleWeightedFontFamily
  ): TextStyle = {
    val __obj = js.Dynamic.literal(background_color = background_color, baseline_offset = baseline_offset, bold = bold, font_family = font_family, font_size = font_size, foreground_color = foreground_color, italic = italic, link = link, small_caps = small_caps, strikethrough = strikethrough, underline = underline, weighted_font_family = weighted_font_family)
  
    __obj.asInstanceOf[TextStyle]
  }
}

