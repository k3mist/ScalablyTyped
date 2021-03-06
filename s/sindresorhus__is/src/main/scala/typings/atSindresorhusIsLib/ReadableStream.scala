package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStream[R] extends js.Object {
  val locked: scala.Boolean = js.native
  def cancel(): Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): Promise[scala.Unit] = js.native
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(options: Anon_Byob): ReadableStreamBYOBReader = js.native
  def pipeThrough[T](hasWritableReadable: Anon_Readable[R, T]): ReadableStream[T] = js.native
  def pipeThrough[T](hasWritableReadable: Anon_Readable[R, T], options: PipeOptions): ReadableStream[T] = js.native
  def pipeTo(dest: WritableStream[R]): Promise[scala.Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: PipeOptions): Promise[scala.Unit] = js.native
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}

@JSGlobal("ReadableStream")
@js.native
object ReadableStream
  extends org.scalablytyped.runtime.Instantiable0[ReadableStream[js.Object]]
     with org.scalablytyped.runtime.Instantiable2[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      (/* strategy */ Anon_HighWaterMarkSize) | (/* strategy */ QueuingStrategy[js.Object]), 
      ReadableStream[Uint8Array] | ReadableStream[js.Object]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      ReadableStream[Uint8Array] | ReadableStream[js.Object]
    ]

