package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseruploadedResource extends js.Object {
  /** Return a list of books uploaded by the current user. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
}

object UseruploadedResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleMaxResults => gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
  ): UseruploadedResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UseruploadedResource]
  }
}

