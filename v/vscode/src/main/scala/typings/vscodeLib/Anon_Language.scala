package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Language
  extends vscodeLib.vscodeMod._MarkedString {
  var language: java.lang.String
  var value: java.lang.String
}

object Anon_Language {
  @scala.inline
  def apply(language: java.lang.String, value: java.lang.String): Anon_Language = {
    val __obj = js.Dynamic.literal(language = language, value = value)
  
    __obj.asInstanceOf[Anon_Language]
  }
}

