# Cloud computing
The practice of using a network of remote servers hosted on the Internet to store,
manage and process data, rather than a local server or personal computer

# Cloud Hosting

## Dedicated Server
- One physical machine dedicated to a single business
- Runs a website or app
- Very expensive, High maintenance
- High security
## Virtual Private Server
-  One physical machine dedicated to a single business
- The physical machine is virtualized into sub-machines
- Runs multiple websites or apps
## Shared Hosting
- One physical machine, shared by hundreds of businesses
- Relies on most tenants under-utilizing their resources
- Very cheap, Very limited
## Cloud Hosting
- Multiple physical machines that act as one system
- The system is abstracted into multiple cloud services
- Flexible, Scalable
- Secure, Cost-effective
- High configurability

# Cloud Service Provider (CSP)
A company which provides multiple Cloud Services and those cloud services can be chained
together to create cloud architectures

# Google Cloud Platform (GCP)
Google calls their cloud provider service offering Google Cloud Platform

# Google Workspace (G-Suite)
A bundled offering of SaaS products for team communication, collaboration for an
organisation

# Benefits of Cloud computing
- Cost-effective
  - You pay for what you consume, no up-front cost
  - On-demand pricing or Pay-as-you-go (PAYG) with thousands of customers sharing the 
  cost of the resources
- Global
  - Launch workloads anywhere in the world
  - Just choose a region
- Secure
  - Cloud provider takes care of physical security
  - Cloud services can be secure by default
  - You have the ability to configure access down to a granular level
- Reliable
  - Data backup
  - Disaster recovery
  - Data replication
  - Fault tolerance
- Scalable
  - Increase or decrease resources and services based on demand
- Elastic
  - Automate scaling during spikes and drop in demand
- Current
  - The underlying hardware and managed software is patched, upgraded and replaced
  by the cloud provide without interruption to you

# Common Cloud Services
A cloud provider can have hundreds of cloud services that are grouped into various types
of services. The four most common types of cloud services for Infrastructure as a 
Service (IaaS) would be
- Compute - virtual computer to run applications, programs, code
- Storage - virtual hardware to store files
- Networking - virtual network being able to define internet connections or network isolations
- Databases - virtual database to for storing reporting data or a database for general 
purpose web-application

GCP has over 60+ cloud services

# Types of cloud computing

## Software as a Service (SaaS) - For Customers
A product that is run and managed by the service provider.
Don't worry about how the service is maintained. It just works and remains available.
Example: Salesforce, Gmail, Office 365

## Platform as a Service (PaaS) - For Developers
Focus on the deployment and management of your apps.
Don't worry about provisioning, configuring or understanding the hardware or OS.
Example: AWS ElasticBeanStalk, Heroku, Google App Engine

## Infrastructure as a Service (IaaS) - For Admins
The basic building blocks for cloud IT. Provides access to networking features, computers
and data storage space.
Don't worry about IT staff, data centers and hardware
Example: Microsoft Azure, AWS, Google Cloud

# Google's Shared Responsibility Model
The Shared Responsibility Model is a simple visualization that helps determine what the
customer is responsible for and what Google is responsible for related to GCP

| Responibility|IaaS| PaaS |SaaS|
|--------------|----|------|----|
| Content | `C` | `C`  | `C` |
| Access Policies | `C` | `C`  | `C` |
| Usage | `C` | `C`  | `C` |
| Deployment | `C` | `C`  | G |
| Web application security | `C` | `C`  | G |
| Identity | `C` | G | G |
| Operations | `C` | G | G |
| Access and Authentication | `C` | G | G |
| Network Security | `C` | G | G |
| Guest OS, Data & Content | `C` | G | G |
| Audit Logging | G | G | G |
| Network | G | G | G |
| Storage + encryption | G | G | G |
| Hardened Kernel + IPC | G | G | G |
| Boot | G | G | G |
| Hardware | G | G | G |

G - Google's Responsibility
C - Customer's Responsibility

The customer is responsible for the data and the configuration of access controls
that resides in GCP.

The customer is responsible for the configuration of cloud services and granting access
to users via permissions.

Google is generally responsible for the underlying Infrastructure.

Responsibility of _in the_ cloud 
If you can configure or store it then you (the customer)
are responsible for it

Responsibility _of the_ cloud 
If you cannot configure it then Google is responsible for it

## Compute as a comparison example of the Shared Responsibility Model

## IaaS
Bare Metal (Compute Engine)
- Customer
    - The Host OS configuration
    - Hypervisor
- Google
  - Physical machine

Virtual Machine (Compute Engine)
- Customer
    - The Host OS configuration
    - Container Runtime
- Google
  - Hypervisor, Physical machine
Containers (Google Kubernetes Engine)
- Customer
  - Configuration of containers
  - Deployment of containers
  - Storage of containers
- Google
  - The OS
  - Hypervisor
  - Container runtime

## PaaS
Managed Platform (App Engine)
- Customer
  - Uploading your code
  - Some configuration of environment
  - Deployment strategies
  - Configuration fo associated services
- Google
  - Servers
  - OS
  - Networking
  - Storage
  - Security

## SaaS
Word Processor (Google Docs)
- Customer
  - Contents of documents
  - Management of files
  - Configuration of sharing access controls
- Google
  - Servers
  - OS
  - Networking
  - Storage
  - Security

## Function as a Service (FaaS)
Functions (Cloud functions)
- Customer
  - Upload your code
- Google
  - Deployment
  - Container Runtime
  - Networking
  - Storage
  - Security
  - Physical machine

|Responsibility|Bare Metal|Dedicate Host|VM|Containers|Functions|
|--------------|----------|-------------|--|----------|-------|
|Code|`C`|`C`|`C`|`C`|`C`|
|App Container|`C`|`C`|`C`|`C`|G|
|Runtime|`C`|`C`|`C`|`C`|G|
|OS|`C`|`C`|`C`|G|G|
|Virtualization|`C`|G|G|G|G|

# Alternate Shared Responsibility Model view

## GCP
- Hardware/Global infrastructure
  - Region
  - Zones/ Fault Domains
  - Physical Security
- Software
  - Compute
  - Storage
  - Database
  - Networking (Routers/switches etc.)
## Customer
- Configuration of Managed services or Third-party Software
  - Platforms
  - Applications
  - Identity and Access management (IAM)
- Configuration of Virtual Infrastructure and Systems
  - Operating System
  - Network (VPC/Sub-nets etc.)
  - Firewall
- Security Configuration of Data
  - Client-side data encryption
  - Server-side encryption
  - Networking traffic protection
  - Customer data

|Responsibility|On-Premise|IaaS|PaaS|SaaS|
|--------------|----------|----|----|----|
|Applications|`C`|`C`|`C`|G|
|Data|`C`|`C`|`C`|G|
|Runtime|`C`|`C`|G|G|
|Middleware|`C`|`C`|G|G|
|OS|`C`|`C`|G|G|
|Virtualization|`C`|G|G|G|
|Servers|`C`|G|G|G|
|Storage|`C`|G|G|G|
|Networking|`C`|G|G|G|