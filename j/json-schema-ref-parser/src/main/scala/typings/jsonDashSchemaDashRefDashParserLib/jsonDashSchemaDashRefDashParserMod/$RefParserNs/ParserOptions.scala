package typings
package jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  /**
    * All of the built-in parsers allow empty files by default. The JSON and YAML parsers will parse empty files as `undefined`. The text parser will parse empty files as an empty string. The binary parser will parse empty files as an empty byte array.
    *
    * You can set `allowEmpty: false` on any parser, which will cause an error to be thrown if a file empty.
    */
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines which parsers will be used for which files.
    *
    * A regular expression can be used to match files by their full path. A string (or array of strings) can be used to match files by their file extension. Or a function can be used to perform more complex matching logic. See the custom parser docs for details.
    */
  var canParse: js.UndefOr[
    scala.Boolean | stdLib.RegExp | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* file */ FileInfo, scala.Boolean])
  ] = js.undefined
  /**
    * Parsers run in a specific order, relative to other parsers. For example, a parser with `order: 5` will run before a parser with `order: 10`. If a parser is unable to successfully parse a file, then the next parser is tried, until one succeeds or they all fail.
    *
    * You can change the order in which parsers run, which is useful if you know that most of your referenced files will be a certain type, or if you add your own custom parser that you want to run first.
    */
  var order: js.UndefOr[scala.Double] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    canParse: scala.Boolean | stdLib.RegExp | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* file */ FileInfo, scala.Boolean]) = null,
    order: scala.Int | scala.Double = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (canParse != null) __obj.updateDynamic("canParse")(canParse.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

