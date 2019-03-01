package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a media stream. */
trait IMediaStreamDescriptor extends js.Object {
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: scala.Boolean
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: java.lang.String
  /** Gets or sets the name of the stream. */
  var name: java.lang.String
}

object IMediaStreamDescriptor {
  @scala.inline
  def apply(isSelected: scala.Boolean, language: java.lang.String, name: java.lang.String): IMediaStreamDescriptor = {
    val __obj = js.Dynamic.literal(isSelected = isSelected, language = language, name = name)
  
    __obj.asInstanceOf[IMediaStreamDescriptor]
  }
}

