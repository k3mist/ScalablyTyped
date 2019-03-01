package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailComposerOptions extends js.Object {
  var charset: java.lang.String
  var encoding: java.lang.String
  var escapeSMTP: scala.Boolean
  var forceEmbeddedImages: scala.Boolean
  var keepBcc: scala.Boolean
}

object MailComposerOptions {
  @scala.inline
  def apply(
    charset: java.lang.String,
    encoding: java.lang.String,
    escapeSMTP: scala.Boolean,
    forceEmbeddedImages: scala.Boolean,
    keepBcc: scala.Boolean
  ): MailComposerOptions = {
    val __obj = js.Dynamic.literal(charset = charset, encoding = encoding, escapeSMTP = escapeSMTP, forceEmbeddedImages = forceEmbeddedImages, keepBcc = keepBcc)
  
    __obj.asInstanceOf[MailComposerOptions]
  }
}

