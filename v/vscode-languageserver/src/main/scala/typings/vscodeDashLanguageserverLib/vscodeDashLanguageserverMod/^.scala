package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EOL: js.Array[java.lang.String] = js.native
  def combineClientFeatures[O, T](
    one: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.ClientFeature[O],
    two: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.ClientFeature[T]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.ClientFeature[O with T] = js.native
  def combineConsoleFeatures[O, T](
    one: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.ConsoleFeature[O],
    two: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.ConsoleFeature[T]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.ConsoleFeature[O with T] = js.native
  def combineFeatures[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace](
    one: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace],
    two: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[
    OConsole with TConsole, 
    OTracer with TTracer, 
    OTelemetry with TTelemetry, 
    OClient with TClient, 
    OWindow with TWindow, 
    OWorkspace with TWorkspace
  ] = js.native
  def combineTelemetryFeatures[O, T](
    one: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.TelemetryFeature[O],
    two: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.TelemetryFeature[T]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.TelemetryFeature[O with T] = js.native
  def combineTracerFeatures[O, T](
    one: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.TracerFeature[O],
    two: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.TracerFeature[T]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.TracerFeature[O with T] = js.native
  def combineWindowFeatures[O, T](
    one: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.WindowFeature[O],
    two: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.WindowFeature[T]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.WindowFeature[O with T] = js.native
  def combineWorkspaceFeatures[O, T](
    one: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.WorkspaceFeature[O],
    two: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.WorkspaceFeature[T]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.WorkspaceFeature[O with T] = js.native
  def createClientPipeTransport(pipeName: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientSocketTransport(port: scala.Double): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createClientSocketTransport(port: scala.Double, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createConnection(): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.IConnection = js.native
  def createConnection(inputStream: nodeLib.NodeJSNs.ReadableStream, outputStream: nodeLib.NodeJSNs.WritableStream): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.IConnection = js.native
  def createConnection(
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.IConnection = js.native
  def createConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.IConnection = js.native
  def createConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.IConnection = js.native
  def createConnection(strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.IConnection = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.vscodeDashLanguageserverMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createProtocolConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Logger
  ): vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection = js.native
  def createProtocolConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Logger,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection = js.native
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerSocketTransport(port: scala.Double, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def generateRandomPipeName(): java.lang.String = js.native
}

