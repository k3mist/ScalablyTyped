package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesResource extends js.Object {
  /** Retrieves a list of languages. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[LanguagesListResponse]
}

object LanguagesResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[LanguagesListResponse]
  ): LanguagesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LanguagesResource]
  }
}

