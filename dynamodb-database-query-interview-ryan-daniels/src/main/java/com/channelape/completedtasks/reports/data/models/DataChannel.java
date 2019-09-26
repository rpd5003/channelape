package com.channelape.completedtasks.reports.data.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = DataChannel.TABLE_NAME)
public class DataChannel {

	public static final String TABLE_NAME = "Channels";
	public static final String GSI_BUSINESS_ID = "idxBusinessId";
	public static final String GSI_INTEGRATION_ID = "idxIntegrationId";
	public static final String INTEGRATION_ID = "integrationId";
	public static final String BUSINESS_ID = "businessId";

	private static final String ID = "id";
	private static final String NAME = "name";
	private static final String ENABLED = "enabled";
	private static final String CREATION_TIME = "creationTime";
	private static final String UPDATE_TIME = "updateTime";

	private String id;
	private String name;
	private boolean enabled;
	private String businessId;
	private String integrationId;
	private long creationTimeInMilliseconds;
	private long updateTimeInMilliseconds;

	@DynamoDBHashKey(attributeName = ID)
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute(attributeName = NAME)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@DynamoDBAttribute(attributeName = ENABLED)
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@DynamoDBAttribute(attributeName = BUSINESS_ID)
	@DynamoDBIndexHashKey(globalSecondaryIndexName = GSI_BUSINESS_ID)
	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	@DynamoDBAttribute(attributeName = INTEGRATION_ID)
	@DynamoDBIndexHashKey(globalSecondaryIndexName = GSI_INTEGRATION_ID)
	public String getIntegrationId() {
		return integrationId;
	}

	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}

	@DynamoDBAttribute(attributeName = CREATION_TIME)
	public long getCreationTimeInMilliseconds() {
		return creationTimeInMilliseconds;
	}

	public void setCreationTimeInMilliseconds(long creationTimeInMilliseconds) {
		this.creationTimeInMilliseconds = creationTimeInMilliseconds;
	}

	@DynamoDBAttribute(attributeName = UPDATE_TIME)
	public long getUpdateTimeInMilliseconds() {
		return updateTimeInMilliseconds;
	}

	public void setUpdateTimeInMilliseconds(long updateTimeInMilliseconds) {
		this.updateTimeInMilliseconds = updateTimeInMilliseconds;
	}

}
