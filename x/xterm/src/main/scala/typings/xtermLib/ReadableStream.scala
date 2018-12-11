package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream[R] extends js.Object {
  val locked: scala.Boolean = js.native
  def cancel(): js.Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): js.Promise[scala.Unit] = js.native
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(options: Anon_Mode): ReadableStreamBYOBReader = js.native
  def pipeThrough[T](hasWritableReadable: Anon_Readable[T, R]): ReadableStream[T] = js.native
  def pipeThrough[T](hasWritableReadable: Anon_Readable[T, R], options: PipeOptions): ReadableStream[T] = js.native
  def pipeTo(dest: WritableStream[R]): js.Promise[scala.Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: PipeOptions): js.Promise[scala.Unit] = js.native
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}

@JSGlobal("ReadableStream")
@js.native
object ReadableStream
  extends ScalablyTyped.runtime.Instantiable0[ReadableStream[js.Object]]
     with ScalablyTyped.runtime.Instantiable1[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      ReadableStream[stdLib.Uint8Array] | ReadableStream[js.Object]
    ]
     with ScalablyTyped.runtime.Instantiable2[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      (/* strategy */ Anon_HighWaterMark) | (/* strategy */ QueuingStrategy[js.Object]), 
      ReadableStream[stdLib.Uint8Array] | ReadableStream[js.Object]
    ]
