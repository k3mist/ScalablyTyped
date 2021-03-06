package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  def parse(
    str: java.lang.String,
    options: remarkableLib.libMod.RemarkableNs.Options,
    env: remarkableLib.libMod.RemarkableNs.Env,
    tokens: js.Array[remarkableLib.libMod.RemarkableNs.Token]
  ): scala.Unit
  def skipToken(state: remarkableLib.libMod.RemarkableNs.StateInline): scala.Unit
  def tokenize(state: remarkableLib.libMod.RemarkableNs.StateInline): scala.Unit
  def validateLink(url: java.lang.String): scala.Boolean
}

object ParserInline {
  @scala.inline
  def apply(
    parse: (java.lang.String, remarkableLib.libMod.RemarkableNs.Options, remarkableLib.libMod.RemarkableNs.Env, js.Array[remarkableLib.libMod.RemarkableNs.Token]) => scala.Unit,
    skipToken: remarkableLib.libMod.RemarkableNs.StateInline => scala.Unit,
    tokenize: remarkableLib.libMod.RemarkableNs.StateInline => scala.Unit,
    validateLink: java.lang.String => scala.Boolean
  ): ParserInline = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction4(parse), skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize), validateLink = js.Any.fromFunction1(validateLink))
  
    __obj.asInstanceOf[ParserInline]
  }
}

