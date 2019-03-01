package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionedTextDocumentIdentifier extends TextDocumentIdentifier {
  /**
    * The version number of this document. If a versioned text document identifier
    * is sent from the server to the client and the file is not open in the editor
    * (the server has not received an open notification before) the server can send
    * `null` to indicate that the version is unknown and the content on disk is the
    * truth (as speced with document content ownership).
    */
  var version: scala.Double | scala.Null
}

object VersionedTextDocumentIdentifier {
  @scala.inline
  def apply(uri: java.lang.String, version: scala.Int | scala.Double = null): VersionedTextDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionedTextDocumentIdentifier]
  }
}

