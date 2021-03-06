package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a Windows Runtime random access stream for an IStream base implementation. */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamOverStream")
@js.native
abstract class RandomAccessStreamOverStream () extends js.Object {
  /** Gets a value that indicates whether the stream can be read from. */
  var canRead: scala.Boolean = js.native
  /** Gets a value that indicates whether the stream can be written to. */
  var canWrite: scala.Boolean = js.native
  /** Gets the byte offset of the stream. */
  var position: scala.Double = js.native
  /** Gets or sets the size of the random access stream. */
  var size: scala.Double = js.native
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Closes the current stream and releases system resources. */
  def close(): scala.Unit = js.native
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Returns an input stream at a specified location in a stream.
    * @param position The location in the stream at which to begin.
    * @return The input stream.
    */
  def getInputStreamAt(position: scala.Double): IInputStream = js.native
  /**
    * Returns an output stream at a specified location in a stream.
    * @param position The location in the output stream at which to begin.
    * @return The output stream.
    */
  def getOutputStreamAt(position: scala.Double): IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: scala.Double, options: InputStreamOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[IBuffer, scala.Double] = js.native
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  def seek(position: scala.Double): scala.Unit = js.native
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

