package fr.esgi.profilcompose

import androidx.annotation.DrawableRes

internal data class DeveloperProfile(
    val name: String,
    val role: String,
    val bio: String,
    val availability: String,
    val email: String,
    @DrawableRes val avatar: Int,
    val skills: List<String>,
    val projects: List<Project>
)

internal data class Project(
    val title: String,
    val description: String,
    @DrawableRes val icon: Int
)

internal val melvynProfile = DeveloperProfile(
    name = "Melvyn G.",
    role = "Développeur Android junior",
    bio = "Étudiant à l’ESGI, je crée mes premières applications Android avec Kotlin et Jetpack Compose.",
    availability = "Disponible",
    email = "melvyn@example.com",
    avatar = R.drawable.ic_profile,
    skills = listOf("Kotlin", "Jetpack Compose", "Git & GitHub"),
    projects = listOf(
        Project(
            title = "Profil développeur",
            description = "Une fiche Android avec des composants Compose réutilisables.",
            icon = R.drawable.ic_code
        ),
        Project(
            title = "Carnet de tâches",
            description = "Un prototype pour organiser et cocher ses tâches du quotidien.",
            icon = R.drawable.ic_checklist
        )
    )
)
