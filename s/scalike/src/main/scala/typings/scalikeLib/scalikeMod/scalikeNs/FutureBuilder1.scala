package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FutureBuilder1[A, B] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  def chain[C](oc: Future[C]): FutureBuilder2[A, B, C]
  def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Future[C]
}

object FutureBuilder1 {
  @scala.inline
  def apply[A, B](
    chain: Future[js.Any] => FutureBuilder2[A, B, js.Any],
    oa: js.Any,
    ob: js.Any,
    run: js.Function2[/* a */ A, /* b */ B, js.Any] => Future[js.Any]
  ): FutureBuilder1[A, B] = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain), oa = oa, ob = ob, run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[FutureBuilder1[A, B]]
  }
}

