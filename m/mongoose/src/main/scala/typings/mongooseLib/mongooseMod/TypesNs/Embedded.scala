package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/embedded.js
  * http://mongoosejs.com/docs/api.html#types-embedded-js
  */
@js.native
trait Embedded
  extends mongooseLib.mongooseMod.MongooseDocument {
  /** Returns the top level document of this sub-document. */
  def ownerDocument(): mongooseLib.mongooseMod.MongooseDocument = js.native
  /** Returns this sub-documents parent document. */
  def parent(): mongooseLib.mongooseMod.MongooseDocument = js.native
  /** Returns this sub-documents parent array. */
  def parentArray(): DocumentArray[mongooseLib.mongooseMod.MongooseDocument] = js.native
  /** Removes the subdocument from its parent array. */
  def remove(): this.type = js.native
  def remove(options: mongooseLib.Anon_Noop): this.type = js.native
  def remove(options: mongooseLib.Anon_Noop, fn: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
}

