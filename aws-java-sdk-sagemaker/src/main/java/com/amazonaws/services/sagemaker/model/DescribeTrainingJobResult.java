/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrainingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrainingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the model training job.
     * </p>
     */
    private String trainingJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     */
    private String trainingJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     */
    private String tuningJobArn;
    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     */
    private ModelArtifacts modelArtifacts;
    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Starting - Preparing for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Downloading - Optional stage for algorithms that support File training input mode. It indicates data is being
     * downloaded to ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Uploading - Training is complete and model upload is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     * </p>
     * </li>
     * </ul>
     */
    private String trainingJobStatus;
    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>TrainingJobStatus</code>.
     * </p>
     */
    private String secondaryStatus;
    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;
    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     */
    private AlgorithmSpecification algorithmSpecification;
    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;
    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     */
    private ResourceConfig resourceConfig;
    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a>train-vpc</a>.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The condition under which to stop the training job.
     * </p>
     */
    private StoppingCondition stoppingCondition;
    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     */
    private java.util.Date trainingStartTime;
    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     */
    private java.util.Date trainingEndTime;
    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Name of the model training job.
     * </p>
     * 
     * @param trainingJobName
     *        Name of the model training job.
     */

    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * Name of the model training job.
     * </p>
     * 
     * @return Name of the model training job.
     */

    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * <p>
     * Name of the model training job.
     * </p>
     * 
     * @param trainingJobName
     *        Name of the model training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withTrainingJobName(String trainingJobName) {
        setTrainingJobName(trainingJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @param trainingJobArn
     *        The Amazon Resource Name (ARN) of the training job.
     */

    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training job.
     */

    public String getTrainingJobArn() {
        return this.trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @param trainingJobArn
     *        The Amazon Resource Name (ARN) of the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withTrainingJobArn(String trainingJobArn) {
        setTrainingJobArn(trainingJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     * 
     * @param tuningJobArn
     *        The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was
     *        launched by a hyperparameter tuning job.
     */

    public void setTuningJobArn(String tuningJobArn) {
        this.tuningJobArn = tuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was
     *         launched by a hyperparameter tuning job.
     */

    public String getTuningJobArn() {
        return this.tuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a
     * hyperparameter tuning job.
     * </p>
     * 
     * @param tuningJobArn
     *        The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was
     *        launched by a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withTuningJobArn(String tuningJobArn) {
        setTuningJobArn(tuningJobArn);
        return this;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     * 
     * @param modelArtifacts
     *        Information about the Amazon S3 location that is configured for storing model artifacts.
     */

    public void setModelArtifacts(ModelArtifacts modelArtifacts) {
        this.modelArtifacts = modelArtifacts;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     * 
     * @return Information about the Amazon S3 location that is configured for storing model artifacts.
     */

    public ModelArtifacts getModelArtifacts() {
        return this.modelArtifacts;
    }

    /**
     * <p>
     * Information about the Amazon S3 location that is configured for storing model artifacts.
     * </p>
     * 
     * @param modelArtifacts
     *        Information about the Amazon S3 location that is configured for storing model artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withModelArtifacts(ModelArtifacts modelArtifacts) {
        setModelArtifacts(modelArtifacts);
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Starting - Preparing for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Downloading - Optional stage for algorithms that support File training input mode. It indicates data is being
     * downloaded to ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Uploading - Training is complete and model upload is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingJobStatus
     *        The status of the training job. </p>
     *        <p>
     *        For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Starting - Preparing for training.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Downloading - Optional stage for algorithms that support File training input mode. It indicates data is
     *        being downloaded to ML storage volumes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Training - Training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Uploading - Training is complete and model upload is in progress.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     *        </p>
     *        </li>
     * @see TrainingJobStatus
     */

    public void setTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Starting - Preparing for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Downloading - Optional stage for algorithms that support File training input mode. It indicates data is being
     * downloaded to ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Uploading - Training is complete and model upload is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the training job. </p>
     *         <p>
     *         For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Starting - Preparing for training.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Downloading - Optional stage for algorithms that support File training input mode. It indicates data is
     *         being downloaded to ML storage volumes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Training - Training is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Uploading - Training is complete and model upload is in progress.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     *         </p>
     *         </li>
     * @see TrainingJobStatus
     */

    public String getTrainingJobStatus() {
        return this.trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Starting - Preparing for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Downloading - Optional stage for algorithms that support File training input mode. It indicates data is being
     * downloaded to ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Uploading - Training is complete and model upload is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingJobStatus
     *        The status of the training job. </p>
     *        <p>
     *        For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Starting - Preparing for training.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Downloading - Optional stage for algorithms that support File training input mode. It indicates data is
     *        being downloaded to ML storage volumes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Training - Training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Uploading - Training is complete and model upload is in progress.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public DescribeTrainingJobResult withTrainingJobStatus(String trainingJobStatus) {
        setTrainingJobStatus(trainingJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Starting - Preparing for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Downloading - Optional stage for algorithms that support File training input mode. It indicates data is being
     * downloaded to ML storage volumes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Training - Training is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * Uploading - Training is complete and model upload is in progress.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingJobStatus
     *        The status of the training job. </p>
     *        <p>
     *        For the <code>InProgress</code> status, Amazon SageMaker can return these secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Starting - Preparing for training.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Downloading - Optional stage for algorithms that support File training input mode. It indicates data is
     *        being downloaded to ML storage volumes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Training - Training is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Uploading - Training is complete and model upload is in progress.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the <code>Stopped</code> training status, Amazon SageMaker can return these secondary statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        MaxRuntimeExceeded - Job stopped as a result of maximum allowed runtime exceeded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public DescribeTrainingJobResult withTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>TrainingJobStatus</code>.
     * </p>
     * 
     * @param secondaryStatus
     *        Provides granular information about the system state. For more information, see
     *        <code>TrainingJobStatus</code>.
     * @see SecondaryStatus
     */

    public void setSecondaryStatus(String secondaryStatus) {
        this.secondaryStatus = secondaryStatus;
    }

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>TrainingJobStatus</code>.
     * </p>
     * 
     * @return Provides granular information about the system state. For more information, see
     *         <code>TrainingJobStatus</code>.
     * @see SecondaryStatus
     */

    public String getSecondaryStatus() {
        return this.secondaryStatus;
    }

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>TrainingJobStatus</code>.
     * </p>
     * 
     * @param secondaryStatus
     *        Provides granular information about the system state. For more information, see
     *        <code>TrainingJobStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecondaryStatus
     */

    public DescribeTrainingJobResult withSecondaryStatus(String secondaryStatus) {
        setSecondaryStatus(secondaryStatus);
        return this;
    }

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>TrainingJobStatus</code>.
     * </p>
     * 
     * @param secondaryStatus
     *        Provides granular information about the system state. For more information, see
     *        <code>TrainingJobStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecondaryStatus
     */

    public DescribeTrainingJobResult withSecondaryStatus(SecondaryStatus secondaryStatus) {
        this.secondaryStatus = secondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the training job failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * 
     * @return If the training job failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the training job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the training job failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     * 
     * @return Algorithm-specific parameters.
     */

    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters.
     */

    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * Algorithm-specific parameters.
     * </p>
     * 
     * @param hyperParameters
     *        Algorithm-specific parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withHyperParameters(java.util.Map<String, String> hyperParameters) {
        setHyperParameters(hyperParameters);
        return this;
    }

    public DescribeTrainingJobResult addHyperParametersEntry(String key, String value) {
        if (null == this.hyperParameters) {
            this.hyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.hyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.hyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     * 
     * @param algorithmSpecification
     *        Information about the algorithm used for training, and algorithm metadata.
     */

    public void setAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     * 
     * @return Information about the algorithm used for training, and algorithm metadata.
     */

    public AlgorithmSpecification getAlgorithmSpecification() {
        return this.algorithmSpecification;
    }

    /**
     * <p>
     * Information about the algorithm used for training, and algorithm metadata.
     * </p>
     * 
     * @param algorithmSpecification
     *        Information about the algorithm used for training, and algorithm metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withAlgorithmSpecification(AlgorithmSpecification algorithmSpecification) {
        setAlgorithmSpecification(algorithmSpecification);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role configured for the training job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) role configured for the training job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) role configured for the training job.
     * </p>
     * 
     * @param roleArn
     *        The AWS Identity and Access Management (IAM) role configured for the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * 
     * @return An array of <code>Channel</code> objects that describes each data input channel.
     */

    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects that describes each data input channel.
     */

    public void setInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig);
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects that describes each data input channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withInputDataConfig(Channel... inputDataConfig) {
        if (this.inputDataConfig == null) {
            setInputDataConfig(new java.util.ArrayList<Channel>(inputDataConfig.length));
        }
        for (Channel ele : inputDataConfig) {
            this.inputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects that describes each data input channel.
     * </p>
     * 
     * @param inputDataConfig
     *        An array of <code>Channel</code> objects that describes each data input channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker
     *        creates subfolders for model artifacts.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     * 
     * @return The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker
     *         creates subfolders for model artifacts.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates
     * subfolders for model artifacts.
     * </p>
     * 
     * @param outputDataConfig
     *        The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker
     *        creates subfolders for model artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     * 
     * @param resourceConfig
     *        Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     */

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     * 
     * @return Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     */

    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * </p>
     * 
     * @param resourceConfig
     *        Resources, including ML compute instances and ML storage volumes, that are configured for model training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withResourceConfig(ResourceConfig resourceConfig) {
        setResourceConfig(resourceConfig);
        return this;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a>train-vpc</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more
     *        information, see <a>train-vpc</a>.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a>train-vpc</a>.
     * </p>
     * 
     * @return A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more
     *         information, see <a>train-vpc</a>.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more information, see
     * <a>train-vpc</a>.
     * </p>
     * 
     * @param vpcConfig
     *        A <a>VpcConfig</a> object that specifies the VPC that this training job has access to. For more
     *        information, see <a>train-vpc</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The condition under which to stop the training job.
     * </p>
     * 
     * @param stoppingCondition
     *        The condition under which to stop the training job.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The condition under which to stop the training job.
     * </p>
     * 
     * @return The condition under which to stop the training job.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * The condition under which to stop the training job.
     * </p>
     * 
     * @param stoppingCondition
     *        The condition under which to stop the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the training job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     * 
     * @return A timestamp that indicates when the training job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the training job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the training job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     * 
     * @param trainingStartTime
     *        Indicates the time when the training job starts on training instances. You are billed for the time
     *        interval between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch
     *        Logs might be later than this time. The difference is due to the time it takes to download the training
     *        data and to the size of the training container.
     */

    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     * 
     * @return Indicates the time when the training job starts on training instances. You are billed for the time
     *         interval between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch
     *         Logs might be later than this time. The difference is due to the time it takes to download the training
     *         data and to the size of the training container.
     */

    public java.util.Date getTrainingStartTime() {
        return this.trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training job starts on training instances. You are billed for the time interval
     * between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch Logs might be later
     * than this time. The difference is due to the time it takes to download the training data and to the size of the
     * training container.
     * </p>
     * 
     * @param trainingStartTime
     *        Indicates the time when the training job starts on training instances. You are billed for the time
     *        interval between this time and the value of <code>TrainingEndTime</code>. The start time in CloudWatch
     *        Logs might be later than this time. The difference is due to the time it takes to download the training
     *        data and to the size of the training container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withTrainingStartTime(java.util.Date trainingStartTime) {
        setTrainingStartTime(trainingStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @param trainingEndTime
     *        Indicates the time when the training job ends on training instances. You are billed for the time interval
     *        between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *        this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *        SageMaker detects a job failure.
     */

    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @return Indicates the time when the training job ends on training instances. You are billed for the time interval
     *         between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *         this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *         SageMaker detects a job failure.
     */

    public java.util.Date getTrainingEndTime() {
        return this.trainingEndTime;
    }

    /**
     * <p>
     * Indicates the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @param trainingEndTime
     *        Indicates the time when the training job ends on training instances. You are billed for the time interval
     *        between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *        this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *        SageMaker detects a job failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withTrainingEndTime(java.util.Date trainingEndTime) {
        setTrainingEndTime(trainingEndTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the status of the training job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     * 
     * @return A timestamp that indicates when the status of the training job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the status of the training job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the status of the training job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrainingJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: ").append(getTrainingJobName()).append(",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: ").append(getTrainingJobArn()).append(",");
        if (getTuningJobArn() != null)
            sb.append("TuningJobArn: ").append(getTuningJobArn()).append(",");
        if (getModelArtifacts() != null)
            sb.append("ModelArtifacts: ").append(getModelArtifacts()).append(",");
        if (getTrainingJobStatus() != null)
            sb.append("TrainingJobStatus: ").append(getTrainingJobStatus()).append(",");
        if (getSecondaryStatus() != null)
            sb.append("SecondaryStatus: ").append(getSecondaryStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: ").append(getHyperParameters()).append(",");
        if (getAlgorithmSpecification() != null)
            sb.append("AlgorithmSpecification: ").append(getAlgorithmSpecification()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: ").append(getResourceConfig()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: ").append(getTrainingStartTime()).append(",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: ").append(getTrainingEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrainingJobResult == false)
            return false;
        DescribeTrainingJobResult other = (DescribeTrainingJobResult) obj;
        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        if (other.getTuningJobArn() == null ^ this.getTuningJobArn() == null)
            return false;
        if (other.getTuningJobArn() != null && other.getTuningJobArn().equals(this.getTuningJobArn()) == false)
            return false;
        if (other.getModelArtifacts() == null ^ this.getModelArtifacts() == null)
            return false;
        if (other.getModelArtifacts() != null && other.getModelArtifacts().equals(this.getModelArtifacts()) == false)
            return false;
        if (other.getTrainingJobStatus() == null ^ this.getTrainingJobStatus() == null)
            return false;
        if (other.getTrainingJobStatus() != null && other.getTrainingJobStatus().equals(this.getTrainingJobStatus()) == false)
            return false;
        if (other.getSecondaryStatus() == null ^ this.getSecondaryStatus() == null)
            return false;
        if (other.getSecondaryStatus() != null && other.getSecondaryStatus().equals(this.getSecondaryStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getAlgorithmSpecification() == null ^ this.getAlgorithmSpecification() == null)
            return false;
        if (other.getAlgorithmSpecification() != null && other.getAlgorithmSpecification().equals(this.getAlgorithmSpecification()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        hashCode = prime * hashCode + ((getTuningJobArn() == null) ? 0 : getTuningJobArn().hashCode());
        hashCode = prime * hashCode + ((getModelArtifacts() == null) ? 0 : getModelArtifacts().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobStatus() == null) ? 0 : getTrainingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getSecondaryStatus() == null) ? 0 : getSecondaryStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmSpecification() == null) ? 0 : getAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrainingJobResult clone() {
        try {
            return (DescribeTrainingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
