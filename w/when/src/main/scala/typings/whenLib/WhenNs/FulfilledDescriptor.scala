package typings
package whenLib.WhenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FulfilledDescriptor[T]
  extends Descriptor[T]
     with Snapshot[T] {
  var state: whenLib.whenLibStrings.fulfilled
  var value: T
}

