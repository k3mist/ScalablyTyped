package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePromisifyArrayPromiseString extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]]
}

object Anon_HostnamePromisifyArrayPromiseString {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[js.Array[js.Array[java.lang.String]]]): Anon_HostnamePromisifyArrayPromiseString = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Anon_HostnamePromisifyArrayPromiseString]
  }
}

