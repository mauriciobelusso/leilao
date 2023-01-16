<template>
    <div>
        <button @click="addCompanyModal = true">Add Company</button>
        <div v-if="addCompanyModal">
            <h3>Add Company</h3>
            <form @submit.prevent="createCompany">
                <label>
                    Razão Social:
                    <input v-model="newCompany.razaoSocial" />
                </label>
                <label>
                    CNPJ:
                    <input v-model="newCompany.cnpj" v-validate="'required'" />
                </label>
                <label>
                    Logradouro:
                    <input v-model="newCompany.logradouro" />
                </label>
                <label>
                    Município:
                    <input v-model="newCompany.municipio" />
                </label>
                <label>
                    Número:
                    <input v-model="newCompany.numero" />
                </label>
                <label>
                    Complemento:
                    <input v-model="newCompany.complemento" />
                </label>
                <label>
                    Bairro:
                    <input v-model="newCompany.bairro" />
                </label>
                <label>
                    CEP:
                    <input v-model="newCompany.cep" />
                </label>
                <label>
                    Telefone:
                    <input v-model="newCompany.telefone" />
                </label>
                <label>
                    Email:
                    <input v-model="newCompany.email" />
                </label>
                <label>
                    Site:
                    <input v-model="newCompany.site" />
                </label>
                <label>
                    Usuário:
                    <input v-model="newCompany.usuario" />
                </label>
                <label>
                    Senha:
                    <input v-model="newCompany.senha" type="password" />
                </label>
                <button type="submit">Create</button>
                <button @click="addCompanyModal = false">Cancel</button>
            </form>
        </div>
        <table>
            <thead>
                <tr>
                    <th>Razão Social</th>
                    <th>CNPJ</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="company in companies" :key="company.id">
                    <td>{{ company.razaoSocial }}</td>
                    <td>{{ company.cnpj }}</td>
                    <td>
                        <button @click="editCompanyModal = true; selectedCompany = company">Edit</button>
                        <button @click="deleteCompany(company.id)">Delete</button>
                    </td>
                </tr>
            </tbody>
        </table>
        <div v-if="editCompanyModal">
            <h3>Edit Company</h3>
            <form @submit.prevent="updateCompany">
                <label>
                    Razão Social:
                    <input v-model="selectedCompany.razaoSocial" />
                </label>
                <label>
                    CNPJ:
                    <input v-model="selectedCompany.cnpj" />
                </label>
                <label>
                    Logradouro:
                    <input v-model="selectedCompany.logradouro" />
                </label>
                <label>
                    Município:
                    <input v-model="selectedCompany.municipio" />
                </label>
                <label>
                    Número:
                    <input v-model="selectedCompany.numero" />
                </label>
                <label>
                    Complemento:
                    <input v-model="selectedCompany.complemento" />
                </label>
                <label>
                    Bairro:
                    <input v-model="selectedCompany.bairro" />
                </label>
                <label>
                    CEP:
                    <input v-model="selectedCompany.cep" />
                </label>
                <label>
                    Telefone:
                    <input v-model="selectedCompany.telefone" />
                </label>
                <label>
                    Email:
                    <input v-model="selectedCompany.email" />
                </label>
                <label>
                    Site:
                    <input v-model="selectedCompany.site" />
                </label>
                <label>
                    Usuário:
                    <input v-model="selectedCompany.usuario" />
                </label>
                <label>
                    Senha:
                    <input v-model="selectedCompany.senha" type="password" />
                </label>
                <button type="submit">Save</button>
                <button @click="editCompanyModal = false">Cancel</button>
            </form>
        </div>
    </div>
</template>
<script>
    import axios from 'axios'

    export default {
        data() {
            return {
                companies: [],
                newCompany: {},
                addCompanyModal: false,
                editCompanyModal: false,
                selectedCompany: {}
            }
        },
        created() {
            this.readCompanies();
        },
        methods: {
            readCompanies() {
                axios.get(`${process.env.VUE_APP_API_URL}/empresa`)
                .then(response => {
                    this.companies = response.data;
                });
            },
            createCompany() {
                // Validation logic
                if (!this.newCompany.razaoSocial || !this.newCompany.cnpj) return

                axios.post(`${process.env.VUE_APP_API_URL}/empresa`, this.newCompany)
                    .then(response => {
                        console.log(response)

                        // Add the new company to the list
                        this.companies.push(this.newCompany)

                        // Find in server to get ID
                        this.readCompanies();

                        // Clear the new company object
                        this.newCompany = {}

                        // Close the modal
                        this.addCompanyModal = false
                    })
                    .catch(error => {
                        console.log(error);
                        alert("Falha ao inserir.");
                    });
            },
            deleteCompany(id) {
                axios.delete(`${process.env.VUE_APP_API_URL}/empresa/${id}`)
                    .then(response => {
                        console.log(response)
                        // Remove the company with the matching id from the list
                        this.companies = this.companies.filter(company => company.id !== id)
                    })
                    .catch(error => {
                        if(error.response.data.trace.indexOf("DataIntegrityViolationException") !== -1)
                            alert("Falha ao excluir, registro já possui vínculos no sistema.")
                        else {
                            alert("Falha ao excluir.");
                            console.log(error);
                        }
                    });
            },
            updateCompany() {
                // Validation logic
                if (!this.selectedCompany.razaoSocial || !this.selectedCompany.cnpj) return

                axios.put(`${process.env.VUE_APP_API_URL}/empresa`, this.selectedCompany)
                    .then(response => {
                        console.log(response)

                        this.readCompanies();
                        // Close the modal
                        this.editCompanyModal = false
                    })
                    .catch(error => {
                        console.log(error);
                    });
            }
        }
    }
</script>