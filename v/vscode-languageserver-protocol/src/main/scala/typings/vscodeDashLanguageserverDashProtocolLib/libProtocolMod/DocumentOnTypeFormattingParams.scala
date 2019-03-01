package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOnTypeFormattingParams extends js.Object {
  /**
    * The character that has been typed.
    */
  var ch: java.lang.String
  /**
    * The format options.
    */
  var options: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions
  /**
    * The position at which this request was send.
    */
  var position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position
  /**
    * The document to format.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object DocumentOnTypeFormattingParams {
  @scala.inline
  def apply(
    ch: java.lang.String,
    options: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions,
    position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): DocumentOnTypeFormattingParams = {
    val __obj = js.Dynamic.literal(ch = ch, options = options, position = position, textDocument = textDocument)
  
    __obj.asInstanceOf[DocumentOnTypeFormattingParams]
  }
}

