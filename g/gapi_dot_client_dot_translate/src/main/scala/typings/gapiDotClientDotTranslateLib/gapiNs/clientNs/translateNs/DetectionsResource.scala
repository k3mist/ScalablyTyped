package typings
package gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse]
  /** Detects the language of text within a request. */
  def list(request: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse]
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: js.Function1[
      gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse]
    ],
    list: js.Function1[
      gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[DetectionsListResponse]
    ]
  ): DetectionsResource = {
    val __obj = js.Dynamic.literal(detect = detect, list = list)
  
    __obj.asInstanceOf[DetectionsResource]
  }
}

