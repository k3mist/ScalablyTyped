package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranscribeService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_TranscribeService: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ClientConfiguration = js.native
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVocabulary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVocabulary(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.CreateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTranscriptionJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.DeleteTranscriptionJobRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTranscriptionJob(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.DeleteTranscriptionJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVocabulary(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.DeleteVocabularyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVocabulary(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.DeleteVocabularyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
    */
  def getTranscriptionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTranscriptionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptionFileUri field.
    */
  def getTranscriptionJob(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTranscriptionJob(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVocabulary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVocabulary(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.GetVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTranscriptionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTranscriptionJobs(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListTranscriptionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVocabularies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVocabularies(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.ListVocabulariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTranscriptionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTranscriptionJob(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.StartTranscriptionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVocabulary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVocabulary(
    params: awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsTranscribeserviceMod.TranscribeServiceNs.UpdateVocabularyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

