package typings
package tslintLib.tslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinterOptions extends js.Object {
  var fix: scala.Boolean
  var formatter: js.UndefOr[
    java.lang.String | tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor
  ] = js.undefined
  var formattersDirectory: js.UndefOr[java.lang.String] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var rulesDirectory: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

