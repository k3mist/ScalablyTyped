package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrashReporter extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/crash-reporter
  /**
    * Set an extra parameter to be sent with the crash report. The values specified
    * here will be sent in addition to any values set via the extra option when start
    * was called. This API is only available on macOS, if you need to add/update extra
    * parameters on Linux and Windows after your first call to start you can call
    * start again with the updated extra options.
    */
  def addExtraParameter(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Returns the date and ID of the last crash report. If no crash reports have been
    * sent or the crash reporter has not been started, null is returned.
    */
  def getLastCrashReport(): CrashReport = js.native
  /**
    * See all of the current parameters being passed to the crash reporter.
    */
  def getParameters(): scala.Unit = js.native
  /**
    * Note: This API can only be called from the main process.
    */
  def getUploadToServer(): scala.Boolean = js.native
  /**
    * Returns all uploaded crash reports. Each report contains the date and uploaded
    * ID.
    */
  def getUploadedReports(): js.Array[CrashReport] = js.native
  /**
    * Remove a extra parameter from the current set of parameters so that it will not
    * be sent with the crash report.
    */
  def removeExtraParameter(key: java.lang.String): scala.Unit = js.native
  /**
    * This would normally be controlled by user preferences. This has no effect if
    * called before start is called. Note: This API can only be called from the main
    * process.
    */
  def setUploadToServer(uploadToServer: scala.Boolean): scala.Unit = js.native
  /**
    * You are required to call this method before using any other crashReporter APIs
    * and in each process (main/renderer) from which you want to collect crash
    * reports. You can pass different options to crashReporter.start when calling from
    * different processes. Note Child processes created via the child_process module
    * will not have access to the Electron modules. Therefore, to collect crash
    * reports from them, use process.crashReporter.start instead. Pass the same
    * options as above along with an additional one called crashesDirectory that
    * should point to a directory to store the crash reports temporarily. You can test
    * this out by calling process.crash() to crash the child process. Note: To collect
    * crash reports from child process in Windows, you need to add this extra code as
    * well. This will start the process that will monitor and send the crash reports.
    * Replace submitURL, productName and crashesDirectory with appropriate values.
    * Note: If you need send additional/updated extra parameters after your first call
    * start you can call addExtraParameter on macOS or call start again with the
    * new/updated extra parameters on Linux and Windows. Note: On macOS, Electron uses
    * a new crashpad client for crash collection and reporting. If you want to enable
    * crash reporting, initializing crashpad from the main process using
    * crashReporter.start is required regardless of which process you want to collect
    * crashes from. Once initialized this way, the crashpad handler collects crashes
    * from all processes. You still have to call crashReporter.start from the renderer
    * or child process, otherwise crashes from them will get reported without
    * companyName, productName or any of the extra information.
    */
  def start(options: CrashReporterStartOptions): scala.Unit = js.native
}

