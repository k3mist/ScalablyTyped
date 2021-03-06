package typings
package objectDashPathDashImmutableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedObject[T] extends js.Object {
  def assign(): WrappedObject[T] = js.native
  def assign(path: Path): WrappedObject[T] = js.native
  def assign(path: Path, source: T): WrappedObject[T] = js.native
  def del(): WrappedObject[T] = js.native
  def del(path: Path): WrappedObject[T] = js.native
  def push(): WrappedObject[T] = js.native
  def push(path: Path): WrappedObject[T] = js.native
  def push(path: Path, value: js.Any): WrappedObject[T] = js.native
  def set(): WrappedObject[T] = js.native
  def set(path: Path): WrappedObject[T] = js.native
  def set(path: Path, value: js.Any): WrappedObject[T] = js.native
  def update(): WrappedObject[T] = js.native
  def update(path: Path): WrappedObject[T] = js.native
  def update(path: Path, updater: js.Function1[/* formerValue */ js.Any, _]): WrappedObject[T] = js.native
  def value(): T = js.native
}

