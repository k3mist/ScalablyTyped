package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadOperation extends IBackgroundTransferOperation {
  var progress: BackgroundUploadProgress
  var sourceFile: winrtLib.WindowsNs.StorageNs.IStorageFile
  def attachAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation]
  def startAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation]
}

object IUploadOperation {
  @scala.inline
  def apply(
    attachAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation]
    ],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: js.Function0[ResponseInformation],
    getResultStreamAt: js.Function1[scala.Double, winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream],
    group: java.lang.String,
    guid: java.lang.String,
    method: java.lang.String,
    progress: BackgroundUploadProgress,
    requestedUri: winrtLib.WindowsNs.FoundationNs.Uri,
    sourceFile: winrtLib.WindowsNs.StorageNs.IStorageFile,
    startAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[UploadOperation, UploadOperation]
    ]
  ): IUploadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = attachAsync, costPolicy = costPolicy, getResponseInformation = getResponseInformation, getResultStreamAt = getResultStreamAt, group = group, guid = guid, method = method, progress = progress, requestedUri = requestedUri, sourceFile = sourceFile, startAsync = startAsync)
  
    __obj.asInstanceOf[IUploadOperation]
  }
}

