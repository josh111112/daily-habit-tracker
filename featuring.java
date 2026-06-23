%-------------------------
% Resume in Latex
% Author : Jake Gutierrez
% Based off of: https://github.com/sb2nov/resume
% License : MIT
%------------------------

\documentclass[letterpaper,11pt]{article}

\usepackage{latexsym}
\usepackage[empty]{fullpage}
\usepackage{titlesec}
\usepackage{marvosym}
\usepackage[usenames,dvipsnames]{color}
\usepackage{verbatim}
\usepackage{enumitem}
\usepackage[hidelinks]{hyperref}
\usepackage{fancyhdr}
\usepackage[english]{babel}
\usepackage{tabularx}
\input{glyphtounicode}

\pagestyle{fancy}
\fancyhf{} % clear all header and footer fields
\fancyfoot{}
\renewcommand{\headrulewidth}{0pt}
\renewcommand{\footrulewidth}{0pt}

% Adjust margins
\addtolength{\oddsidemargin}{-0.5in}
\addtolength{\evensidemargin}{-0.5in}
\addtolength{\textwidth}{1in}
\addtolength{\topmargin}{-.5in}
\addtolength{\textheight}{1.0in}

\urlstyle{same}

\raggedbottom
\raggedright
\setlength{\tabcolsep}{0in}

% Sections formatting
\titleformat{\section}{
  \vspace{-4pt}\scshape\raggedright\large
}{}{0em}{}[\color{black}\titlerule \vspace{-5pt}]

% Ensure that generate pdf is machine readable/ATS parsable
\pdfgentounicode=1

%-------------------------
% Custom commands
\newcommand{\resumeItem}[1]{
  \item\small{
    {#1 \vspace{-2pt}}
  }
}

\newcommand{\resumeSubheading}[4]{
  \vspace{-2pt}\item
    \begin{tabular*}{0.97\textwidth}[t]{l@{\extracolsep{\fill}}r}
      \textbf{#1} & #2 \\
      \textit{\small#3} & \textit{\small #4} \\
    \end{tabular*}\vspace{-7pt}
}

\newcommand{\resumeSubSubheading}[2]{
    \item
    \begin{tabular*}{0.97\textwidth}{l@{\extracolsep{\fill}}r}
      \textit{\small#1} & \textit{\small #2} \\
    \end{tabular*}\vspace{-7pt}
}

\newcommand{\resumeProjectHeading}[2]{
    \item
    \begin{tabular*}{0.97\textwidth}{l@{\extracolsep{\fill}}r}
      \small#1 & #2 \\
    \end{tabular*}\vspace{-7pt}
}

\newcommand{\resumeSubItem}[1]{\resumeItem{#1}\vspace{-4pt}}

\renewcommand\labelitemii{$\vcenter{\hbox{\tiny$\bullet$}}$}

\newcommand{\resumeSubHeadingListStart}{\begin{itemize}[leftmargin=0.15in, label={}]}
\newcommand{\resumeSubHeadingListEnd}{\end{itemize}}
\newcommand{\resumeItemListStart}{\begin{itemize}}
\newcommand{\resumeItemListEnd}{\end{itemize}\vspace{-5pt}}

%-------------------------------------------
%%%%%%  RESUME STARTS HERE  %%%%%%%%%%%%%%%%%%%%%%%%%%%%

\begin{document}

%----------HEADING----------
\begin{center}
    \textbf{\Huge \scshape Joshua Johnson} \\ \vspace{1pt}
    \small (616) 425-1061 $|$ \href{mailto:josh.johnson0388@gmail.com}{\underline{josh.johnson0388@gmail.com}} $|$ 
    \href{https://www.linkedin.com/in/joshua-johnson0388/}{\underline{LinkedIn}} $|$
    \href{https://josh111112.github.io/josh11112.github.io/}{\underline{Portfolio}} $|$ 
    \href{https://github.com/josh111112}{\underline{Github}} $|$
    Grand Rapids, MI
\end{center}

%-----------EDUCATION-----------
\section{Education}
  \resumeSubHeadingListStart
    \resumeSubheading
      {Grand Valley State University}{Grand Rapids, MI}
      {B.S.E. in Computer Science $|$ \emph{GPA: 3.6/4.0}}{May 2026}
      \resumeItemListStart
        \resumeItem{\textbf{Campus Involvement \& Teamwork:} Active member of GVSU Computing Club and Intramural Soccer, fostering continuous learning, strategic collaboration, and strong communication.}
      \resumeItemListEnd
  \resumeSubHeadingListEnd

%-----------EXPERIENCE-----------
\section{Experience}
  \resumeSubHeadingListStart

    \resumeSubheading
      {Embedded Software Intern}{April 2025 -- August 2025}
      {Medallion Instrumentation Systems}{}
      \resumeItemListStart
        \resumeItem{Collaborated with cross-functional engineering teams to resolve CAN bus address collisions by implementing a C-based \textbf{NMEA 2000 (SAE J1939-81)} address-claiming protocol, enabling the launch of standalone gauges for seamless third-party integration.}
        \resumeItem{Validated production software by comparing system behavior against technical requirements, identifying and documenting an average of \textbf{10 defects per week}.}
        \resumeItem{Developed a Go backend that interfaced with a C library to parse \textbf{CAN} bus data from onboard systems.}
      \resumeItemListEnd

    \resumeSubheading
      {IT Support Technician}{August 2023 -- March 2025}
      {Grand Valley State University}{}
      \resumeItemListStart
        \resumeItem{Articulated complex technical problems in clear, simple terms to assist non-technical university faculty and students, ensuring 99\% operational continuity across campus.}
        \resumeItem{Managed the full lifecycle of IT support tickets via ServiceNow, meticulously documenting technical issues, tracking troubleshooting steps, and ensuring rapid resolutions for university staff and students.}
      \resumeItemListEnd


  \resumeSubHeadingListEnd

%-----------PROJECTS-----------
\section{Projects}
    \resumeSubHeadingListStart
     \resumeProjectHeading
         {\textbf{Automated Embedded Chess System} $|$ \emph{C++, Arduino, Hardware Integration} $|$ \href{https://www.youtube.com/shorts/6yIkqdkF7vs}{\underline{Link}}}{Fall 2024}
         \resumeItemListStart
            \resumeItem{Engineered an automated embedded system integrating real-time software with robotic actuation, utilizing \textbf{prototyping} and \textbf{iterative testing} to refine hardware-software synchronization.}
            \resumeItem{Designed a robust data acquisition network using an 8x8 magnetic sensor grid and daisy-chained shift registers, ensuring high-fidelity signal processing and reliable piece detection.}
            \resumeItem{Developed efficient C++ bit-shifting algorithms to rapidly process binary sensor data, minimizing computational overhead to achieve low-latency, real-time physical responses.}
         \resumeItemListEnd
        \resumeProjectHeading
          {\textbf{MuscleMap iOS App} $|$ \emph{Swift, RealityKit, SwiftData, Blender, Swift Charts}}{Fall 2025 -- Present}
          \resumeItemListStart
            \resumeItem{Developed an interactive 3D anatomy visualizer using \textbf{RealityKit} and Blender, mapping training data to specific muscle meshes to provide real-time recovery feedback through dynamic, color-coded heatmaps.}
            \resumeItem{Architected a persistent local database using \textbf{SwiftData} to correlate workout volume with recovery algorithms, automatically adjusting muscle state visuals based on time-elapsed and training intensity.}
          \resumeItemListEnd
    \resumeProjectHeading
        {\textbf{Daily Habit Tracker} $|$ \emph{Java, Spring Boot, Angular, TypeScript, H2 Database} $|$ \href{https://github.com/josh111112/daily-habit-tracker}{\underline{Link}}}{Summer 2026}
        \resumeItemListStart
          \resumeItem{Engineered a full-stack web application with a \textbf{Spring Boot REST API} backend and a responsive \textbf{Angular} frontend to facilitate and gamify daily routine management.}
          \resumeItem{Architected a persistent data layer utilizing an \textbf{H2} relational database with \textbf{Spring Data JPA}, enabling real-time streak tracking and persistent habit logging capabilities.}
          \resumeItem{Designed a dynamic, modern user interface featuring interactive components and \textbf{glassmorphism} styling, significantly improving user engagement and retention.}
        \resumeItemListEnd
        \resumeProjectHeading
            {\textbf{Terra AI: Research Knowledge Graph} $|$ \emph{Neo4j, Python, Cypher, Gemini API} $|$ \href{https://github.com/josh111112/Knowledge-Graph}{\underline{Link}}}{Spring 2026}
            \resumeItemListStart
            \resumeItem{Engineered a \textbf{GraphRAG} pipeline using Neo4j to model complex, multi-modal relationships between research papers, datasets, and scientific fusion methods.}
            \resumeItem{Developed a \textbf{Text2Cypher} retrieval system that utilizes Gemini to dynamically translate natural language questions into optimized graph queries.}
            \resumeItem{Architected a dual-stage intent classifier to route inquiries between general conversation and database searches, synthesizing LLM summaries from retrieved research records.}
          \resumeItemListEnd
    \resumeSubHeadingListEnd

%-----------TECHNICAL SKILLS-----------
\section{Technical Skills}
 \begin{itemize}[leftmargin=0.15in, label={}]
    \small{\item{
     \textbf{Languages}{: Python, C, Java, Swift} \\
     \textbf{Tools \& Database}{: Google Cloud, Docker, Neo4j, Cypher, SQL (MySQL, PostgreSQL), JIRA} \\
     \textbf{Methodologies \& Concepts}{: Object-Oriented Design, Relational Database Programming, Agile Methods}
    }}
 \end{itemize}

%-------------------------------------------
\end{document}